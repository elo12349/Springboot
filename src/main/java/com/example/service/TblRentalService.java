package com.example.service;

import org.springframework.stereotype.Repository;
import com.example.entity.TblRental;
import com.example.entity.TblRentalKey;

@Repository
public interface TblRentalService {
	TblRental selectById(String memberId);
	TblRental henkyaku(String memberId);
}