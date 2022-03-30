package study;

import org.springframework.data.jpa.repository.JpaRepository;

import study.entity.Login;

public interface MyLoginRepository extends JpaRepository<Login, String>{

	public Login findByUserName(String uname);

	public Login findByPassword(String uname);
}
