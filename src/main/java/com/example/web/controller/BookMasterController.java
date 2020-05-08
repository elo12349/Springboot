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

/**
 * 
 * 【クラスの説明】 
 * 本マスタのコントローラクラス
 * 
 * 【変更履歴】 1.00 2018/09/16 新規作成
 * 
 * @author T.Yagi
 * 
 * @version 1.00
 *
 */
@Controller
@RequestMapping("/")
public class BookMasterController {
	
	@Autowired
	public TblAdminService TblAdminservice;
	
	@GetMapping("/")
	public String Loginpage(Model model) {
		 if (!model.containsAttribute("Tbladmin")) {
	            model.addAttribute("Tbladmin", new TblAdmin());
	        }
		return "postgres";
	}
	@PostMapping(value = "/", params = "login_button")
	public String Login(@ModelAttribute("Tbladmin") TblAdmin Tbladmin) {
		boolean found = TblAdminservice.Login(Tbladmin.getAdminId(), Tbladmin.getPassword());
		if(found) {
			return "success";
		}else {
			return "false";
		}
	}
}
