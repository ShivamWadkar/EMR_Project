package com.emr.dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.emr.dto.DoctorDto;
import com.emr.pojo.Doctor;
import com.emr.repositories.MyDoctorRepository;


@Repository
public class DoctorDao {

	@Autowired
	MyDoctorRepository repo;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public DoctorDto getDoctor(String loginId) {

		try {
			Doctor result = repo.findByLoginId(loginId);
			int id = result.getId();
			String fname = result.getFirstName();
			String lname = result.getLastName();
			String gender = result.getGender();
			String education = result.getEducation();
			String phoneNo = result.getContact();
			String specialization = result.getSpecialization();
			float experience = result.getExperience();
			String uname = result.getLoginId();
			Blob blob = result.getProfilePhoto();
			String email = result.getEmail();
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

			DoctorDto newDoctor = new DoctorDto( id,  fname,  lname,  gender,  uname,  email,
					 base64Image,  specialization,  experience,  education,  phoneNo);
			return newDoctor;
		}catch (SQLException | IOException ex) {
			ex.printStackTrace();
			return null;
		}


	}
	
	public DoctorDto verifyUser(String loginId,String pass) {

		Doctor result = repo.findByLoginId(loginId);
		System.out.println("After finding doctor");
		//Patient userP = repo.findByPassword(pass);
		//System.out.println(result);
		try {
			if(result != null && passwordEncoder.matches(pass, result.getPassword()))
			{
				int id = result.getId();
				String fname = result.getFirstName();
				String lname = result.getLastName();
				String gender = result.getGender();
				String phoneNo = result.getContact();	
				String uname = result.getLoginId();
				Blob blob = result.getProfilePhoto();
				String email = result.getEmail();
				String education = result.getEducation();
				String specialization = result.getSpecialization();
				float experience = result.getExperience();
				
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

				DoctorDto newDoctor = new DoctorDto(id,fname,lname,gender,uname,email,base64Image,specialization,experience,education,phoneNo);

				System.out.println("Sending doctor object");
				return newDoctor;
			}

			else
				return null;
		}catch (SQLException | IOException ex) {
			ex.printStackTrace();
			return null;
		}

	}

	public void signUp(String firstName, String lastName, String gender, String education, String specialization,
			float experience, String contact, String email, String loginId, String password, Blob profilePhoto) {
		// TODO Auto-generated method stub
		System.out.println("In signup dao");
		String encPassword = passwordEncoder.encode(password);
		Doctor patient = new Doctor( firstName,  lastName,  gender,education,specialization,experience,contact,email,
				 loginId, encPassword,  profilePhoto);
		
		repo.save(patient);
	}
	
	public void update(  String firstName, String lastName, String gender, String contactNo,
			 String specialization, float experience, String education,Blob profile,String uname) {
		
		Doctor result = repo.findByLoginId(uname);
		
		result.setFirstName(firstName);
		result.setLastName(lastName);
		result.setGender(gender);
		result.setContact(contactNo);	
		result.setProfilePhoto(profile);
		result.setEducation(education);
		result.setSpecialization(specialization);
		result.setExperience(experience);
		
		repo.save(result);
	}
}
