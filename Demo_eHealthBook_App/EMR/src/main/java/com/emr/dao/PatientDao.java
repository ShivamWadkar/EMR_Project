package com.emr.dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.emr.dto.PatientDto;
import com.emr.pojo.Patient;
import com.emr.repositories.MyPatientRepository;


@Repository
public class PatientDao {

	@Autowired
	private MyPatientRepository repo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public PatientDto getPatient(String loginId) {

		Patient result = repo.findByLoginId(loginId);
		try {
			
			if(result != null) {
				
				int id = result.getId();
				String fname = result.getFirstName();
				String lname = result.getLastName();
				String gender = result.getGender();
				Date dob = result.getDateOfBirth();
				String phoneNo = result.getPhoneNo();
				String add = result.getAddress();
				String bloodGroup = result.getBloodGroup();
				String uname = result.getLoginId();
				Blob blob = result.getProfilePhoto();
				String email = result.getEmailId();
				InputStream inputStream = blob.getBinaryStream();
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				byte[] buffer = new byte[4096];
				int bytesRead = -1;

				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);                  
				}

				byte[] imageBytes = outputStream.toByteArray();
				String base64Image = Base64.getEncoder().encodeToString(imageBytes);


				inputStream.close();
				outputStream.close();

				PatientDto newPatient = new PatientDto(id,fname,lname,gender,dob,phoneNo,add,bloodGroup,uname,email,base64Image);
				return newPatient;
			}
			else {
				
				return null;
			}
			
		}catch (SQLException | IOException ex) {
			ex.printStackTrace();
			return null;
		}


	}

	public PatientDto verifyUser(String loginId,String pass) {

		Patient result = repo.findByLoginId(loginId);
		//Patient userP = repo.findByPassword(pass);
		System.out.println(result);
		try {
			if(result != null && passwordEncoder.matches(pass, result.getPassword()))
			{
				int id = result.getId();
				String fname = result.getFirstName();
				String lname = result.getLastName();
				String gender = result.getGender();
				Date dob = result.getDateOfBirth();
				String phoneNo = result.getPhoneNo();
				String add = result.getAddress();
				String bloodGroup = result.getBloodGroup();
				String uname = result.getLoginId();
				Blob blob = result.getProfilePhoto();
				String email = result.getEmailId();
				InputStream inputStream = blob.getBinaryStream();
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				byte[] buffer = new byte[4096];
				int bytesRead = -1;

				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);                  
				}

				byte[] imageBytes = outputStream.toByteArray();
				String base64Image = Base64.getEncoder().encodeToString(imageBytes);


				inputStream.close();
				outputStream.close();

				PatientDto newPatient = new PatientDto(id,fname,lname,gender,dob,phoneNo,add,bloodGroup,uname,email,base64Image);

				return newPatient;
			}

			else
				return null;
		}catch (SQLException | IOException ex) {
			ex.printStackTrace();
			return null;
		}

	}

	public void signUp(String firstName, String lastName, String dob, String gender, String email, String contactNo,
			String address, String bloodGroup, String uname, String password, Blob profilePhoto,String emailId) {

		String encPassword = passwordEncoder.encode(password);
		System.out.println("In signup dao");
		Patient patient = new Patient( firstName,  lastName,  gender,  Date.valueOf(dob),  contactNo,
				address,  bloodGroup,  uname,  encPassword,  profilePhoto, emailId);

		repo.save(patient);
	}

	public void update( String firstName, String lastName, String dob, String gender, String contactNo,
			 String address, String bloodGroup,Blob profilePhoto,String uname) {
		
		Patient result = repo.findByLoginId(uname);
		
		result.setFirstName(firstName);
		result.setLastName(lastName);
		result.setDateOfBirth(Date.valueOf(dob));
		result.setGender(gender);
		result.setAddress(address);
		result.setBloodGroup(bloodGroup);
		result.setPhoneNo(contactNo);
		result.setProfilePhoto(profilePhoto);
		
		repo.save(result);
	}
}
