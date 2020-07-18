package com.example.form;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.TblBook;

public class TblRentalForm {
	
	private String bookId;
	@NotNull
	private String memberId;
	
	private Integer rentalDate;
	private Integer returnDate;
	private Integer status;
	@Autowired
	private TblBook Tblbook;
	private String bookTitle;
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public Integer getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(Integer rentalDate) {
		this.rentalDate = rentalDate;
	}

	public Integer getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Integer returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
}