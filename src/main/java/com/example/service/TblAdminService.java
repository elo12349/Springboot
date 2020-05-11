package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.TblAdmin;
import com.example.mapper.TblAdminMapper;

@Service
public class TblAdminService implements UserService{

	@Autowired
	private TblAdminMapper TblAdminmapper;
	
	@Override
	public String Login(String adminId, String password) {
		TblAdminmapper.Login(adminId, password);
		return "Login";
	}
	
}