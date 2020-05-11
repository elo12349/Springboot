package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.entity.TblAdmin;
import com.example.service.TblAdminService;


@Controller
@RequestMapping("/loginpage")
public class BookMasterController {
	@Autowired
	private TblAdminService TblAdminservice;
	
	@GetMapping
	public String Loginpage(Model model) {
		 if (!model.containsAttribute("Tbladmin")) {
	            model.addAttribute("Tbladmin", new TblAdmin());
	        }
	        return "loginpage";
	}
	@PostMapping
	public String login(@ModelAttribute("Tbladmin") TblAdmin Tbladmin) {
		boolean found = TblAdminservice.Login(Tbladmin.getAdminId(), Tbladmin.getPassword());
		if (found) {				
			return "success";
		} else {				
			return "failure";
		}
	}
}
