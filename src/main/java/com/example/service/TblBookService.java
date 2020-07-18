package com.example.service;

import org.springframework.stereotype.Repository;

import com.example.entity.TblBook;
import com.example.model.TblBookModel;
@Repository
public interface TblBookService {
	 TblBook selectById(String bookId);
	 
	 int insert(TblBookModel model);
	 void updateById(TblBookModel model);
	 void deleteById(String bookId);
}