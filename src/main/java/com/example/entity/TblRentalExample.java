package com.example.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblRentalExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public TblRentalExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("member_id is not null");
			return (Criteria) this;
		}

		public Criteria andMemberIdEqualTo(String value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotEqualTo(String value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThan(String value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(String value) {
			addCriterion("member_id >=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThan(String value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(String value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLike(String value) {
			addCriterion("member_id like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotLike(String value) {
			addCriterion("member_id not like", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIn(List<String> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotIn(List<String> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdBetween(String value1, String value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotBetween(String value1, String value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andBookIdIsNull() {
			addCriterion("book_id is null");
			return (Criteria) this;
		}

		public Criteria andBookIdIsNotNull() {
			addCriterion("book_id is not null");
			return (Criteria) this;
		}

		public Criteria andBookIdEqualTo(String value) {
			addCriterion("book_id =", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdNotEqualTo(String value) {
			addCriterion("book_id <>", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdGreaterThan(String value) {
			addCriterion("book_id >", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdGreaterThanOrEqualTo(String value) {
			addCriterion("book_id >=", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdLessThan(String value) {
			addCriterion("book_id <", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdLessThanOrEqualTo(String value) {
			addCriterion("book_id <=", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdLike(String value) {
			addCriterion("book_id like", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdNotLike(String value) {
			addCriterion("book_id not like", value, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdIn(List<String> values) {
			addCriterion("book_id in", values, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdNotIn(List<String> values) {
			addCriterion("book_id not in", values, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdBetween(String value1, String value2) {
			addCriterion("book_id between", value1, value2, "bookId");
			return (Criteria) this;
		}

		public Criteria andBookIdNotBetween(String value1, String value2) {
			addCriterion("book_id not between", value1, value2, "bookId");
			return (Criteria) this;
		}

		public Criteria andRentalDateIsNull() {
			addCriterion("rental_date is null");
			return (Criteria) this;
		}

		public Criteria andRentalDateIsNotNull() {
			addCriterion("rental_date is not null");
			return (Criteria) this;
		}

		public Criteria andRentalDateEqualTo(Date value) {
			addCriterionForJDBCDate("rental_date =", value, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("rental_date <>", value, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateGreaterThan(Date value) {
			addCriterionForJDBCDate("rental_date >", value, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("rental_date >=", value, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateLessThan(Date value) {
			addCriterionForJDBCDate("rental_date <", value, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("rental_date <=", value, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateIn(List<Date> values) {
			addCriterionForJDBCDate("rental_date in", values, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("rental_date not in", values, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("rental_date between", value1, value2, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andRentalDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("rental_date not between", value1, value2, "rentalDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateIsNull() {
			addCriterion("return_date is null");
			return (Criteria) this;
		}

		public Criteria andReturnDateIsNotNull() {
			addCriterion("return_date is not null");
			return (Criteria) this;
		}

		public Criteria andReturnDateEqualTo(Date value) {
			addCriterionForJDBCDate("return_date =", value, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("return_date <>", value, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateGreaterThan(Date value) {
			addCriterionForJDBCDate("return_date >", value, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("return_date >=", value, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateLessThan(Date value) {
			addCriterionForJDBCDate("return_date <", value, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("return_date <=", value, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateIn(List<Date> values) {
			addCriterionForJDBCDate("return_date in", values, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("return_date not in", values, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("return_date between", value1, value2, "returnDate");
			return (Criteria) this;
		}

		public Criteria andReturnDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("return_date not between", value1, value2, "returnDate");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andRegistIdIsNull() {
			addCriterion("regist_id is null");
			return (Criteria) this;
		}

		public Criteria andRegistIdIsNotNull() {
			addCriterion("regist_id is not null");
			return (Criteria) this;
		}

		public Criteria andRegistIdEqualTo(String value) {
			addCriterion("regist_id =", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdNotEqualTo(String value) {
			addCriterion("regist_id <>", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdGreaterThan(String value) {
			addCriterion("regist_id >", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdGreaterThanOrEqualTo(String value) {
			addCriterion("regist_id >=", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdLessThan(String value) {
			addCriterion("regist_id <", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdLessThanOrEqualTo(String value) {
			addCriterion("regist_id <=", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdLike(String value) {
			addCriterion("regist_id like", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdNotLike(String value) {
			addCriterion("regist_id not like", value, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdIn(List<String> values) {
			addCriterion("regist_id in", values, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdNotIn(List<String> values) {
			addCriterion("regist_id not in", values, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdBetween(String value1, String value2) {
			addCriterion("regist_id between", value1, value2, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistIdNotBetween(String value1, String value2) {
			addCriterion("regist_id not between", value1, value2, "registId");
			return (Criteria) this;
		}

		public Criteria andRegistDateIsNull() {
			addCriterion("regist_date is null");
			return (Criteria) this;
		}

		public Criteria andRegistDateIsNotNull() {
			addCriterion("regist_date is not null");
			return (Criteria) this;
		}

		public Criteria andRegistDateEqualTo(Date value) {
			addCriterionForJDBCDate("regist_date =", value, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("regist_date <>", value, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateGreaterThan(Date value) {
			addCriterionForJDBCDate("regist_date >", value, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("regist_date >=", value, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateLessThan(Date value) {
			addCriterionForJDBCDate("regist_date <", value, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("regist_date <=", value, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateIn(List<Date> values) {
			addCriterionForJDBCDate("regist_date in", values, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("regist_date not in", values, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("regist_date between", value1, value2, "registDate");
			return (Criteria) this;
		}

		public Criteria andRegistDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("regist_date not between", value1, value2, "registDate");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIsNull() {
			addCriterion("update_id is null");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIsNotNull() {
			addCriterion("update_id is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateIdEqualTo(String value) {
			addCriterion("update_id =", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotEqualTo(String value) {
			addCriterion("update_id <>", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdGreaterThan(String value) {
			addCriterion("update_id >", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdGreaterThanOrEqualTo(String value) {
			addCriterion("update_id >=", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLessThan(String value) {
			addCriterion("update_id <", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLessThanOrEqualTo(String value) {
			addCriterion("update_id <=", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdLike(String value) {
			addCriterion("update_id like", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotLike(String value) {
			addCriterion("update_id not like", value, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdIn(List<String> values) {
			addCriterion("update_id in", values, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotIn(List<String> values) {
			addCriterion("update_id not in", values, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdBetween(String value1, String value2) {
			addCriterion("update_id between", value1, value2, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateIdNotBetween(String value1, String value2) {
			addCriterion("update_id not between", value1, value2, "updateId");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNull() {
			addCriterion("update_date is null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIsNotNull() {
			addCriterion("update_date is not null");
			return (Criteria) this;
		}

		public Criteria andUpdateDateEqualTo(Date value) {
			addCriterionForJDBCDate("update_date =", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("update_date <>", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThan(Date value) {
			addCriterionForJDBCDate("update_date >", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("update_date >=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThan(Date value) {
			addCriterionForJDBCDate("update_date <", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("update_date <=", value, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateIn(List<Date> values) {
			addCriterionForJDBCDate("update_date in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("update_date not in", values, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("update_date between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("update_date not between", value1, value2, "updateDate");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIsNull() {
			addCriterion("delete_flg is null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIsNotNull() {
			addCriterion("delete_flg is not null");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgEqualTo(String value) {
			addCriterion("delete_flg =", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotEqualTo(String value) {
			addCriterion("delete_flg <>", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgGreaterThan(String value) {
			addCriterion("delete_flg >", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgGreaterThanOrEqualTo(String value) {
			addCriterion("delete_flg >=", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLessThan(String value) {
			addCriterion("delete_flg <", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLessThanOrEqualTo(String value) {
			addCriterion("delete_flg <=", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgLike(String value) {
			addCriterion("delete_flg like", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotLike(String value) {
			addCriterion("delete_flg not like", value, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgIn(List<String> values) {
			addCriterion("delete_flg in", values, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotIn(List<String> values) {
			addCriterion("delete_flg not in", values, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgBetween(String value1, String value2) {
			addCriterion("delete_flg between", value1, value2, "deleteFlg");
			return (Criteria) this;
		}

		public Criteria andDeleteFlgNotBetween(String value1, String value2) {
			addCriterion("delete_flg not between", value1, value2, "deleteFlg");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table tbl_rental
	 * @mbg.generated  Tue Jun 23 13:35:33 JST 2020
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_rental
     *
     * @mbg.generated do_not_delete_during_merge Thu May 21 11:42:46 ICT 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}