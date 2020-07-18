package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.base.KashidashiMemberException;
import com.example.entity.TblMember;
import com.example.mapper.TblMemberMapper;

@Service
public class TblMemberServiceimp implements TblMemberService{
	private TblMemberMapper TblMembermapper;
	@Autowired
    public TblMemberServiceimp(TblMemberMapper TblMembermapper) {
        this.TblMembermapper = TblMembermapper;
    }
	@Override
	public TblMember selectById(String memberId) {
		try {
			return TblMembermapper.selectById(memberId);
		}catch(Exception e) {
			throw new KashidashiMemberException("member.search");
		}
	}
}