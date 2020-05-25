package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.base.KashidashiException;
import com.example.entity.TblBook;
import com.example.mapper.TblBookMapper;

@Service
public class TblBookServiceimp implements TblBookService{
	private final TblBookMapper TblBookmapper;
	
	@Autowired
    public TblBookServiceimp(TblBookMapper TblBookmapper) {
        this.TblBookmapper = TblBookmapper;
    }
	@Transactional
	@Override
	public TblBook selectById(String bookId) {
		try {
			return TblBookmapper.selectById(bookId);
		}catch(Exception e) {
			throw new KashidashiException("search.error");
		}
	}
	
}
