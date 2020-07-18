package com.example.entity;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class TblRental extends TblRentalKey {

	private Date returnDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_rental.status
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	private Integer status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_rental.regist_id
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	private String registId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_rental.regist_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	private Date registDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_rental.update_id
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	private String updateId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_rental.update_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	private Date updateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_rental.delete_flg
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	private String deleteFlg;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.return_date
	 * @return  the value of tbl_rental.return_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public Date getReturnDate() {
		return returnDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.return_date
	 * @param returnDate  the value for tbl_rental.return_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.status
	 * @return  the value of tbl_rental.status
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.status
	 * @param status  the value for tbl_rental.status
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.regist_id
	 * @return  the value of tbl_rental.regist_id
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public String getRegistId() {
		return registId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.regist_id
	 * @param registId  the value for tbl_rental.regist_id
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setRegistId(String registId) {
		this.registId = registId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.regist_date
	 * @return  the value of tbl_rental.regist_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public Date getRegistDate() {
		return registDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.regist_date
	 * @param registDate  the value for tbl_rental.regist_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.update_id
	 * @return  the value of tbl_rental.update_id
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public String getUpdateId() {
		return updateId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.update_id
	 * @param updateId  the value for tbl_rental.update_id
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.update_date
	 * @return  the value of tbl_rental.update_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.update_date
	 * @param updateDate  the value for tbl_rental.update_date
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_rental.delete_flg
	 * @return  the value of tbl_rental.delete_flg
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public String getDeleteFlg() {
		return deleteFlg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_rental.delete_flg
	 * @param deleteFlg  the value for tbl_rental.delete_flg
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
}