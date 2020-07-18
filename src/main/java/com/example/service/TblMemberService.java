package com.example.service;

import org.springframework.stereotype.Repository;

import com.example.entity.TblMember;

@Repository
public interface TblMemberService{
	TblMember selectById(String memberId);
}