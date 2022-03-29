package emr.dao;

import java.sql.Blob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import emr.MyDoctorRepository;
import emr.pojo.Doctor;


@Repository
public class DoctorDao {

	@Autowired
	MyDoctorRepository repo;

	public Doctor verifyUser(String loginId,String pass) {

		Doctor userN = repo.findByLoginId(loginId);
		Doctor userP = repo.findByPassword(pass);
		System.out.println(userN);
		if(userN != null && userP != null)
		{
				return userN;
		}
		else
			return null;
	}

	public void signUp(String firstName, String lastName, String gender, String education, String specialization,
			float experience, String contact, String email, String loginId, String password, Blob profilePhoto) {
		// TODO Auto-generated method stub
		System.out.println("In signup dao");
		Doctor patient = new Doctor( firstName,  lastName,  gender,education,specialization,experience,contact,email,
				 loginId, password,  profilePhoto);
		
		repo.save(patient);
	}
}
