package com.example.service;

import org.springframework.stereotype.Repository;

import com.example.entity.TblBook;
@Repository
public interface TblBookService {
	 TblBook selectById(String bookId);
}