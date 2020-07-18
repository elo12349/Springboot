package com.example.form;

public class KashidashiMemberForm{
	
	private String memberId;

	private String memberFamilyName;
	
	private String memberFamilyNameKana;
	
	private String memberFirstName;
	
	private String memberFirstNameKana;
	
	private String address;
	
	private Integer birthDay;
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberFamilyName() {
		return memberFamilyName;
	}
	public void setMemberFamilyName(String memberFamilyName) {
		this.memberFamilyName = memberFamilyName;
	}
	public String getMemberFamilyNameKana() {
		return memberFamilyNameKana;
	}
	public void setMemberFamilyNameKana(String memberFamilyNameKana) {
		this.memberFamilyNameKana = memberFamilyNameKana;
	}
	public String getMemberFirstName() {
		return memberFirstName;
	}
	public void setMemberFirstName(String memberFirstName) {
		this.memberFirstName = memberFirstName;
	}
	public String getMemberFirstNameKana() {
		return memberFirstNameKana;
	}
	public void setMemberFirstNameKana(String memberFirstNameKana) {
		this.memberFirstNameKana = memberFirstNameKana;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Integer birthDay) {
		this.birthDay = birthDay;
	}
}