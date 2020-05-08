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
	public boolean Login(String adminId, String password) {
		TblAdmin Tbladmin = TblAdminmapper.Login(adminId, password);
		if(Tbladmin != null && Tbladmin.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
	
}