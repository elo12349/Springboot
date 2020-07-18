package com.example.web.controller;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.base.HonMasterException;
import com.example.entity.TblAdmin;
import com.example.entity.TblBook;
import com.example.entity.TblMember;
import com.example.entity.TblRental;
import com.example.entity.TblRentalKey;
import com.example.form.KashidashiBookMasterForm;
import com.example.form.KashidashiMemberForm;
import com.example.form.TblBookForm;
import com.example.form.TblRentalForm;
import com.example.model.TblBookModel;
import com.example.service.TblAdminService;
import com.example.service.TblBookService;
import com.example.service.TblMemberService;
import com.example.service.TblRentalService;

@Controller
public class BookMasterController {
	@Autowired
	private TblAdminService TblAdminservice;
	@Autowired
	private TblBookService TblBookservice;
	@Autowired
	private TblMemberService TblMemberservice;
	@Autowired
	private TblRentalService TblRentalservice;
	@Autowired
    private MessageSource messagesource;
	
	@RequestMapping(value="/loginpage", method= RequestMethod.GET)
    public String login(@ModelAttribute("Tbladmin") TblAdmin Tbladmin,Model model,String adminId,String password){
		if(adminId != null) {
			String messages = messagesource.getMessage("Message", null, Locale.JAPAN);
			model.addAttribute("message", messages);
		}
        return "loginpage";
    }
	@RequestMapping(value="/menu", method= RequestMethod.GET)
	public String home() {
		return "menu";
	}
	@RequestMapping(value="/logoutSuccess", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null) {
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "logoutSuccess";
	}
	@RequestMapping(value="/403", method = RequestMethod.GET)
	public String errorpage() {
		return "403";
	}
	@RequestMapping(value="/HonMaster", method = RequestMethod.GET)
	public String bookmaster(Model model) {
		if (!model.containsAttribute("Tblbook")) {
            model.addAttribute("Tblbook", new KashidashiBookMasterForm());
        }
		return "HonMaster";
	}
	@RequestMapping(value="/HonMaster",method = RequestMethod.POST, params="btn_search")
	public String searchbook(Model model,String bookId) {
		try {
			TblBook Tblbook =  TblBookservice.selectById(bookId);
			if(Tblbook != null) {
				KashidashiBookMasterForm form = new KashidashiBookMasterForm();
				form.setBookId(Tblbook.getBookId());
	            form.setBookTitle(Tblbook.getBookTitle());
	            form.setAuthorName(Tblbook.getAuthorName());
	            form.setPublisher(Tblbook.getPublisher());
	            Calendar publicationDay = Calendar.getInstance();
	            publicationDay.setTime(Tblbook.getPublicationDay());
	            form.setPublicationDate(publicationDay.get(Calendar.DAY_OF_MONTH));
	            form.setPublicationMonth(publicationDay.get(Calendar.MONTH) + 1);
	            form.setPublicationYear(publicationDay.get(Calendar.YEAR));
				model.addAttribute("Tblbook", form);
		        model.addAttribute("message","譛ｬ縺瑚ｦ九▽縺九ｊ縺ｾ縺励◆縲�");  
			}else {
				KashidashiBookMasterForm form = new KashidashiBookMasterForm();
				form.setBookId(bookId);
				model.addAttribute("Tblbook", form);
	            String messages = messagesource.getMessage("error", null, Locale.getDefault());
	            model.addAttribute("message", messages);
	        }
		}catch(Exception e) {
				KashidashiBookMasterForm form = new KashidashiBookMasterForm();
				form.setBookId(bookId);
				model.addAttribute("Tblbook", form);
				String messages = messagesource.getMessage("search.error",null, Locale.getDefault());
	    		model.addAttribute("message", messages);
		}
		return "HonMaster";
	}
	@RequestMapping(value="/shainMember", method = RequestMethod.GET)
	public String shainMemberpage() {
		return "shainMember";
	}
	@RequestMapping(value="/Kashidashi", method = RequestMethod.GET)
	public String Kashidashipage(Model model,TblBook Tblbook,TblMember Tblmember) {
		 if (!model.containsAttribute("Tblbook")) {
	            model.addAttribute("Tblbook", new KashidashiBookMasterForm());
	     }else if(!model.containsAttribute("Tblmember")) {
	    	 	model.addAttribute("Tblmember", new KashidashiMemberForm());
	     }
		 return "Kashidashi";
	}
	@RequestMapping(value="/Henkyaku", method = RequestMethod.GET)
	public String Henkyakupage(Model model,TblRental Tblrental) {
		 if (!model.containsAttribute("Tblrental")) {
	            model.addAttribute("Tblrental", new TblRentalForm());
	        }
		return "Henkyaku";
	}
	@PostMapping(value="/Henkyaku", params="btn_search")
	public String showId(String memberId,Model model) {
		try {
			TblRental Tblrental = TblRentalservice.selectById(memberId);
			if(Tblrental != null) {
				TblRentalForm rentalform = new TblRentalForm();
				TblBookForm bookform = new TblBookForm();
				rentalform.setMemberId(Tblrental.getMemberId());
				rentalform.setBookId(Tblrental.getBookId());
				bookform.setBookTitle(bookform.getBookTitle());
				model.addAttribute("Tblrental", rentalform);
				model.addAttribute("message","件貸出されています。");
			}else {
				TblRentalForm rentalform = new TblRentalForm();				
				model.addAttribute("Tblrental", rentalform);
				String messages = messagesource.getMessage("notfound",null, Locale.getDefault());
	    		model.addAttribute("message", messages);
			}
		}catch(Exception e) {
			TblRentalForm rentalform = new TblRentalForm();
			model.addAttribute("Tblrental", rentalform);
			String messages = messagesource.getMessage("rental.search",null, Locale.getDefault());
    		model.addAttribute("message", messages);
		}
		return "Henkyaku";
	}
	@PostMapping(value="/Henkyaku", params="btn_henkyaku")
	public String detail(String memberId,Model model,@ModelAttribute("Tblrental")  TblRentalForm rentalform) {
		try {
			TblRental tblrental = TblRentalservice.selectById(memberId);
			System.out.println(tblrental);
			if(tblrental != null) {			
				rentalform.setMemberId(tblrental.getMemberId());
				rentalform.setBookId(tblrental.getBookId());
				model.addAttribute("Tblrental", rentalform);
				model.addAttribute("message","返却されました。");
			}
			else {							
				model.addAttribute("Tblrental", rentalform);
				String messages = messagesource.getMessage("notfound2",null, Locale.getDefault());
	    		model.addAttribute("message", messages);
			}
		}catch(Exception e) {
			String messages = messagesource.getMessage("rental.search",null, Locale.getDefault());
    		model.addAttribute("message", messages);
		}
		
		return "Henkyaku";
	}
	@PostMapping(value="/Kashidashi", params="btn_search")
	public String show(String bookId, Model model , String memberId) {
		try {
			TblBook Tblbook =  TblBookservice.selectById(bookId);			
			if(Tblbook != null) {
				KashidashiBookMasterForm form = new KashidashiBookMasterForm();				
				form.setBookId(Tblbook.getBookId());
	            form.setBookTitle(Tblbook.getBookTitle());	          
				model.addAttribute("Tblbook", form);
		        model.addAttribute("message","見つかりました。");  
			}else{
				KashidashiBookMasterForm form = new KashidashiBookMasterForm();
				form.setBookId(bookId);
				model.addAttribute("Tblbook", form);
				String messages = messagesource.getMessage("error",null, Locale.getDefault());
	    		model.addAttribute("message", messages);
			}
		}catch(Exception e) {
				KashidashiBookMasterForm form = new KashidashiBookMasterForm();
				form.setBookId(bookId);
				model.addAttribute("Tblbook", form);
				String messages = messagesource.getMessage("search.error",null, Locale.getDefault());
	    		model.addAttribute("message", messages);
		}
		return "Kashidashi";
	}
//	@PostMapping(value="/Kashidashi", params="btn_kashidashi")
//	public String memberidcheck(@ModelAttribute("Tblmember") String memberId, Model model, KashidashiMemberForm memberform) {
//		try {
//			TblMember Tblmember = TblMemberservice.selectById(memberId);
//			
//			if(Tblmember != null) {							
//				memberform.setMemberId(Tblmember.getMemberId());          
//				model.addAttribute("Tblmember", memberform);
//		        model.addAttribute("message","現在貸し出し中です。");  
//			}    
//			else {
//				model.addAttribute("Tblmember", memberform);
//				String messages = messagesource.getMessage("error",null, Locale.getDefault());
//				model.addAttribute("message", messages);
//			}	
//		}catch(Exception e) {
//				memberform.setMemberId(memberId);
//				model.addAttribute("Tblmember", memberform);
//				model.addAttribute("message","DBエラーが発生しました。");
//		}
//		return "Kashidashi";
//	}
	@PostMapping(value="/Kashidashi", params="btn_kashidashi")
	public String check(String bookId, Model model, String memberId) {
		try {
			  TblMember Tblmember = TblMemberservice.selectById(memberId);
			  if(Tblmember != null) {	
					KashidashiMemberForm memberform = new KashidashiMemberForm();
					memberform.setMemberId(Tblmember.getMemberId());          
					model.addAttribute("Tblmember", memberform);
			        model.addAttribute("message","現在貸し出し中です。");  
			  }else {
					KashidashiMemberForm memberform = new KashidashiMemberForm();
					memberform.setMemberId(memberId);
					model.addAttribute("Tblmember", memberform);
					String messages = messagesource.getMessage("error",null, Locale.getDefault());
					model.addAttribute("message", messages);
			  }		
		}catch(Exception e) {
				KashidashiMemberForm memberform = new KashidashiMemberForm();
				memberform.setMemberId(memberId);
				model.addAttribute("Tblmember", memberform);
				String messages = messagesource.getMessage("search.error",null, Locale.getDefault());
	    		model.addAttribute("message", messages);
		}
		return "Kashidashi";
	}
	@PostMapping(value="/HonMaster" , params = "btn_insert")
	public String add(@ModelAttribute("Tblbook")  TblBookForm TblBookform, Model model1) {
		try {
      		  if(TblBookform.getBookId() == null) {
      			  	model1.addAttribute("Tblbook", TblBookform);
			        TblBookModel model = new TblBookModel();
			        model.setBookId(TblBookform.getBookId());
			        model.setBookTitle(TblBookform.getBookTitle());
			        model.setAuthorName(TblBookform.getAuthorName());
			        model.setPublisher(TblBookform.getPublisher());
			        Calendar publicationDay = Calendar.getInstance();
			        publicationDay.set(TblBookform.getPublicationYear(), TblBookform.getPublicationMonth() - 1, TblBookform.getPublicationDate());
			        model.setPublicationDay(publicationDay.getTime()); 
			        model.setRegistDate(new Date());
			        if(model.getRegistId() == null ) {
			        	model.setRegistId(new String());
			        }else if(model.getDeleteFlg() == null){
			        	model.setDeleteFlg(new String());
			        }
			        TblBookservice.insert(model);
            		String messages = messagesource.getMessage("booksuccess",null, Locale.getDefault());
                	model1.addAttribute("message", messages);
      		  }else {
	     			 String messages1 = messagesource.getMessage("bookfalse", null, Locale.getDefault());
	     			 model1.addAttribute("message",messages1);
      		  }     	 	
	        } catch (Exception e) {      		 
		        	 String messages = messagesource.getMessage("insert.error", null, Locale.getDefault());
		             model1.addAttribute("message", messages);     
        	}
        			 return "HonMaster";
	}
	  @PostMapping(value = "/HonMaster", params = "btn_update")
	   public String update(@ModelAttribute("Tblbook") @Valid TblBookForm form,Model model1) {
		  	try {	       
				        TblBookModel model = new TblBookModel();
				        model.setBookId(form.getBookId());
				        model.setBookTitle(form.getBookTitle());
				        model.setAuthorName(form.getAuthorName());
				        model.setPublisher(form.getPublisher());
				        Calendar publicationDay = Calendar.getInstance();
				        publicationDay.set(form.getPublicationYear(), form.getPublicationMonth() - 1, form.getPublicationDate());       
				        model.setPublicationDay(publicationDay.getTime());           
		        	 	TblBookservice.updateById(model);
		        	 	String messages = messagesource.getMessage("update.success",null, Locale.getDefault());
		        	 	model1.addAttribute("message", messages);   
	        } catch (HonMasterException e) { 	
			            String messages = messagesource.getMessage("update.error", null, Locale.getDefault());
			            model1.addAttribute("message", messages);	           
	        	}
	        		return "HonMaster";

	  }
	  @PostMapping(value = "/HonMaster", params = "btn_delete")
	    public String destroy(String bookId,Model model) {
	    	try {
	    		if(bookId == null) {
	    			model.addAttribute("message", "notfound");
	    		}else {
	    			TblBookservice.deleteById(bookId);
		    		model.addAttribute("message", "譛ｬID繧貞炎髯､縺励∪縺励◆縲�");
	    		}
	    	}catch(Exception e) {
	    		String messages = messagesource.getMessage("delete.error", null, Locale.getDefault());
	    		model.addAttribute("message", messages);
	    	}
	        return "HonMaster";
	    }
}
	







