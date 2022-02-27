package emr.pojo;

import java.sql.Blob;
import java.sql.Date;
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
@Table(name="patient_info_tbl")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int id;
	
	@Column(name="first_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String firstName;
	
	@Column(name="last_name",columnDefinition = "VARCHAR(100)",nullable = false)
	private String lastName;
	
	@Column(name="gender",columnDefinition = "VARCHAR(15)",nullable = false)
	private String gender;
	
	@Column(name="dob",columnDefinition = "DATE",nullable = false)
	private Date dateOfBirth;
	
	@Column(name="contact_no",columnDefinition = "VARCHAR(20)",nullable = false)
	private String phoneNo;
	
	@Column(name="address",columnDefinition = "VARCHAR(250)",nullable = false)
	private String address;
	
	@Column(name="blood_group",columnDefinition = "VARCHAR(5)",nullable = false)
	private String bloodGroup;
	
	@Column(name="login_id",columnDefinition = "VARCHAR(100)",unique = true,nullable = false)
	private String loginId;
	
	@Column(name="password",columnDefinition = "VARCHAR(100)",nullable = false)
	private String password;
	
	@Column(name="profile_photo",columnDefinition = "MEDIUMBLOB")
	@Lob
	private Blob profilePhoto;

	@OneToMany(mappedBy = "patient")
	private Set<Document> document;
	
	@OneToMany(mappedBy = "patient")
	private Set<Event> event;
	
	
	public Set<Document> getDocument() {
		return document;
	}

	public void setDocument(Set<Document> document) {
		this.document = document;
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

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", address=" + address + ", bloodGroup="
				+ bloodGroup + ", loginId=" + loginId + ", password=" + password + ", profilePhoto=" + profilePhoto
				+ "]";
	}
	
	
	
}
		




















