package com.emr.dto;


public class DoctorDto {
	
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private String loginId;
	private String emailId;
	private String base64Image;
	private String specialization;
	private float experience;
	private String education;
	private String phoneNo;
	
	public DoctorDto() {
		
	}

	public DoctorDto(int id, String firstName, String lastName, String gender, String loginId, String emailId,
			String base64Image, String specialization, float experience, String education, String phoneNo) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.loginId = loginId;
		this.emailId = emailId;
		this.base64Image = base64Image;
		this.specialization = specialization;
		this.experience = experience;
		this.education = education;
		this.phoneNo = phoneNo;
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

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(Float experience) {
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "DoctorDto [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", loginId=" + loginId + ", emailId=" + emailId + ", base64Image=" + base64Image + ", specialization="
				+ specialization + ", experience=" + experience + ", education=" + education + ", phoneNo=" + phoneNo
				+ "]";
	}
	
	
	
	

}
