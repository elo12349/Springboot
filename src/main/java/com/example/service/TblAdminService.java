package com.example.service;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entity.TblAdmin;
import com.example.mapper.TblAdminMapper;

@Service
public class TblAdminService implements UserDetailsService{

	@Autowired
	private TblAdminMapper TblAdminmapper;
	
	@Override
	public UserDetails loadUserByUsername(String adminId) throws UsernameNotFoundException {
		TblAdmin Tbladmin = TblAdminmapper.selectByPrimaryKey(adminId);
        if (Tbladmin == null) {
            throw new UsernameNotFoundException("Admin Id " + adminId + " Admin Id not found");
        }
        Collection<GrantedAuthority> authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(Tbladmin.getAdminId(), Tbladmin.getPassword(),authorities);
	}
}