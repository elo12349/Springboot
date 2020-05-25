package com.example.web.controller;

import java.util.Calendar;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.entity.TblAdmin;
import com.example.entity.TblBook;
import com.example.form.KashidashiForm;
import com.example.service.TblAdminService;
import com.example.service.TblBookService;

@Controller
public class BookMasterController {
	@Autowired
	private TblAdminService TblAdminservice;
	@Autowired
	private TblBookService TblBookservice;
	@Autowired
    private MessageSource messagesource;
	
	@RequestMapping(value="/loginpage", method= RequestMethod.GET)
    public String login(@ModelAttribute("Tbladmin") TblAdmin Tbladmin,RedirectAttributes redirectAttributes,String adminId,String password){
		if(adminId != null) {
			String messages = messagesource.getMessage("Message", null, Locale.JAPAN);
			redirectAttributes.addFlashAttribute("message", messages);
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
	public String bookmaster() {
		return "HonMaster";
	}
	@RequestMapping(value="/shainMember", method = RequestMethod.GET)
	public String shainMemberpage() {
		return "shainMember";
	}
	@RequestMapping(value="/Kashidashi", method = RequestMethod.GET)
	public String Kashidashipage(Model model,TblBook Tblbook) {
		 if (!model.containsAttribute("Tblbook")) {
	            model.addAttribute("Tblbook", new KashidashiForm());
	        }
		 return "Kashidashi";
	}
	@RequestMapping(value="/Henkyaku", method = RequestMethod.GET)
	public String Henkyakupage() {
		return "Henkyaku";
	}
	@RequestMapping(value="/Kashidashi", method = RequestMethod.POST)
	public String show(String bookId, Model model ) {
		try {
			TblBook Tblbook =  TblBookservice.selectById(bookId);
			if(Tblbook != null) {
				KashidashiForm form = new KashidashiForm();
				form.setBookId(Tblbook.getBookId());
	            form.setBookTitle(Tblbook.getBookTitle());
				model.addAttribute("Tblbook", form);
		        model.addAttribute("message","本が見つかりました。");  
			}else {
				String messages = messagesource.getMessage("error", null, Locale.getDefault());
				model.addAttribute("message", messages);
			}
		}catch(Exception e) {
			String messages = messagesource.getMessage("search.error",null, Locale.getDefault());
    		model.addAttribute("message", messages);
		}
		return "Kashidashi";
		
	}
	
}
