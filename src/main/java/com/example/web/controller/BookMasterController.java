package com.example.web.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.entity.TblAdmin;
import com.example.service.TblAdminService;

@Controller
public class BookMasterController {
	@Autowired
	private TblAdminService TblAdminservice;
	@Autowired
    private MessageSource messagesource;
	
	@RequestMapping(value="/loginpage", method= RequestMethod.GET)
    public String login(@ModelAttribute("Tbladmin") TblAdmin Tbladmin,RedirectAttributes redirectAttributes,String adminId,String password){
//		if(adminId != null) {
//			String message = messagesource.getMessage("Message", null, Locale.JAPAN);
//			redirectAttributes.addFlashAttribute("message", message);
//		}
        return "loginpage";
    }
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String home() {
		return "home";
	}
}
