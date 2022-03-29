package emr.dao;

import java.sql.Blob;
import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import emr.MyPatientRepository;
import emr.pojo.Patient;


@Repository
public class PatientDao {

	@Autowired
	MyPatientRepository repo;

	public Patient verifyUser(String loginId,String pass) {

		Patient userN = repo.findByLoginId(loginId);
		Patient userP = repo.findByPassword(pass);
		System.out.println(userN);
		if(userN != null && userP != null)
		{
				return userN;
		}
		else
			return null;
	}

	public void signUp(String firstName, String lastName, String dob, String gender, String email, String contactNo,
			String address, String bloodGroup, String uname, String password, Blob profilePhoto,String emailId) {
		// TODO Auto-generated method stub
		System.out.println("In signup dao");
		Patient patient = new Patient( firstName,  lastName,  gender,  Date.valueOf(dob),  contactNo,
				 address,  bloodGroup,  uname,  password,  profilePhoto, emailId);
		
		repo.save(patient);
	}

}
