package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.TblAdmin;



@Controller
public class BookMasterController {
//	@Autowired
//	private TblAdminService TblAdminservice;
//	
	@RequestMapping(value="/loginpage", method= RequestMethod.GET)
    public String login(){
        return "loginpage";
    }
	@RequestMapping(value="/home", method= RequestMethod.GET)
	public String home() {
		return "home";
	}
}
