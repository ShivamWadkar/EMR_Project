package com.emr.pojo;

import java.sql.Blob;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="doctor_info_tbl")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private int id;
	
	@Column(name="first_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String firstName;
	
	@Column(name="last_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String lastName;
	
	@Column(name="gender",columnDefinition = "VARCHAR(15)",nullable = false)
	private String gender;
	
	@Column(name="education",columnDefinition = "VARCHAR(100)",nullable = false)
	private String education;
	
	@Column(name="specialization",columnDefinition = "VARCHAR(100)",nullable = false)
	private String specialization;
	
	@Column(name="experience",columnDefinition = "FLOAT(11,1)",nullable = false)
	private float experience;
	
	@Column(name="contact_no",columnDefinition = "VARCHAR(15)",nullable = false)
	private String contact;
	
	@Column(name="email",columnDefinition = "VARCHAR(100)",nullable = false)
	private String email;
	
	@Column(name="login_id",columnDefinition = "VARCHAR(100)",unique = true,nullable = false)
	private String loginId;
	
	@Column(name="password",columnDefinition = "VARCHAR(100)",nullable = false)
	private String password;
	
	@Column(name="profile_photo",columnDefinition = "MEDIUMBLOB")
	@Lob
	private Blob profilePhoto;
	
	@OneToMany(mappedBy = "doctor")
	private Set<Access> access;

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

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
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

	public void setExperience(float experience) {
		this.experience = experience;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Blob getProfilePhoto() {
		return profilePhoto;
	}

	public void setProfilePhoto(Blob profilePhoto) {
		this.profilePhoto = profilePhoto;
	}

	public Set<Access> getAccess() {
		return access;
	}

	public void setAccess(Set<Access> access) {
		this.access = access;
	}

	public Doctor() {
		
	}
	
	
	
	public Doctor(String firstName, String lastName, String gender, String education, String specialization,
			float experience, String contact, String email, String loginId, String password, Blob profilePhoto) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.education = education;
		this.specialization = specialization;
		this.experience = experience;
		this.contact = contact;
		this.email = email;
		this.loginId = loginId;
		this.password = password;
		this.profilePhoto = profilePhoto;
		
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", education=" + education + ", specialization=" + specialization + ", experience=" + experience
				+ ", contact=" + contact + ", email=" + email + ", loginId=" + loginId + ", password=" + password
				+ ", profilePhoto=" + profilePhoto + ", access=" + access + "]";
	}

	

	
}
