package emr;
import org.springframework.data.jpa.repository.JpaRepository;

import emr.pojo.Patient;

public interface MyPatientRepository extends JpaRepository<Patient,String>{

	public Patient findByLoginId(String uname);
	public Patient findByPassword(String uname);
}
