package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.base.HenkyakuException;
import com.example.entity.TblRental;
import com.example.entity.TblRentalKey;
import com.example.mapper.TblRentalMapper;

@Service
public class TblRentalServiceimp implements TblRentalService{
	@Autowired
	private TblRentalMapper TblRentalmapper;
	
	@Override
	public TblRental selectById(String memberId) {
		try {
			return TblRentalmapper.selectById(memberId);
		}catch(Exception e) {
			throw new HenkyakuException("rental.search");
		}
	}

	@Override
	public TblRental henkyaku(String memberId) {
		try {
			return TblRentalmapper.henkyaku(memberId);
		}catch(Exception e) {
			throw new HenkyakuException("rental.search");
		}
	}
	
	
}