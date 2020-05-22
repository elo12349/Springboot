package com.example.entity;

import java.util.Date;

public class TblBook {
    
    private String bookId;

   
    private String bookTitle;

   
    private String authorName;

    
    private String publisher;

   
    private Date publicationDay;

   
    private String registId;

   
    private Date registDate;

    
    private String updateId;

   
    private Date updateDate;

    
    private String deleteFlg;

    
    public String getBookId() {
        return bookId;
    }

    
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    
    public String getBookTitle() {
        return bookTitle;
    }

    
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    
    public String getAuthorName() {
        return authorName;
    }

   
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    
    public String getPublisher() {
        return publisher;
    }

    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    
    public Date getPublicationDay() {
        return publicationDay;
    }

    
    public void setPublicationDay(Date publicationDay) {
        this.publicationDay = publicationDay;
    }

    
    public String getRegistId() {
        return registId;
    }

    
    public void setRegistId(String registId) {
        this.registId = registId;
    }

    
    public Date getRegistDate() {
        return registDate;
    }

    
    public void setRegistDate(Date registDate) {
        this.registDate = registDate;
    }

    
    public String getUpdateId() {
        return updateId;
    }

    
    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    
    public Date getUpdateDate() {
        return updateDate;
    }

    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    
    public String getDeleteFlg() {
        return deleteFlg;
    }

    
    public void setDeleteFlg(String deleteFlg) {
        this.deleteFlg = deleteFlg;
    }
}