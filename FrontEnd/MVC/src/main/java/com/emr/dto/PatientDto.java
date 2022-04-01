package com.emr.dto;

import java.sql.Date;


public class PatientDto {

	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private Date dateOfBirth;
	private String phoneNo;
	private String address;
	private String bloodGroup;
	private String loginId;
	private String emailId;
	private String base64Image;
	
	public PatientDto(){
		
	}

	public PatientDto(int id, String firstName, String lastName, String gender, Date dateOfBirth, String phoneNo,
			String address, String bloodGroup, String loginId, String emailId, String base64Image) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.loginId = loginId;
		this.emailId = emailId;
		this.base64Image = base64Image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getBase64Image() {
		return base64Image;
	}

	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}

	@Override
	public String toString() {
		return "PatientDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", address=" + address + ", bloodGroup="
				+ bloodGroup + ", loginId=" + loginId + ", emailId=" + emailId + ", base64Image=" + base64Image + "]";
	}
	
	
	
}
