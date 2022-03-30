package study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import study.MyLoginRepository;
import study.entity.Login;

@Repository
public class LoginDAO {

	@Autowired
	MyLoginRepository repo;

	public boolean verifyUser(String uname,String pass) {

		Login userN = repo.findByUserName(uname);
		Login userP = repo.findByPassword(pass);
		if(userN.getUserName().equals(uname) && userP.getPassword().equals(pass)) {

			return true;
		}
		else
			return false;
	}
}
