package com.example.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.base.HonMasterException;
import com.example.base.KashidashiBookMasterException;
import com.example.entity.TblBook;
import com.example.mapper.TblBookMapper;
import com.example.model.TblBookModel;

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
			throw new KashidashiBookMasterException("search.error");
		}
	}
	@Override
	public int insert(TblBookModel model) {
		try {
			TblBook Tblbook = new TblBook();
			Tblbook.setBookId(model.getBookId());
			Tblbook.setBookTitle(model.getBookTitle());
			Tblbook.setAuthorName(model.getAuthorName());
			Tblbook.setPublisher(model.getPublisher());
			Tblbook.setPublicationDay(model.getPublicationDay());
			Tblbook.setRegistDate(new Date());
			Tblbook.setRegistId(new String());
			Tblbook.setDeleteFlg(new String());
			
			return TblBookmapper.insert(Tblbook);
		}catch(Exception e) {
			throw new HonMasterException("insert.error");
		}
	}
	@Override
	public void updateById(TblBookModel model) {
		try {
		 	TblBook Tblbook = new TblBook();
		 	Tblbook.setBookId(model.getBookId());
		 	Tblbook.setBookTitle(model.getBookTitle());
		 	Tblbook.setAuthorName(model.getAuthorName());
		 	Tblbook.setPublisher(model.getPublisher());
		 	Tblbook.setPublicationDay(model.getPublicationDay());
	        Tblbook.setUpdateDate(new Date());
	        TblBookmapper.updateByPrimaryKey(Tblbook);
     } catch (Exception e) {
         throw new HonMasterException("update.error");
     }	
	}
	@Override
	public void deleteById(String bookId) {
		try {
			TblBookmapper.deleteById(bookId);
		}catch(Exception e) {
			throw new HonMasterException("delete.error");
		}

	}	
}
