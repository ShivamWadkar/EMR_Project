package emr.dao;

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

}
