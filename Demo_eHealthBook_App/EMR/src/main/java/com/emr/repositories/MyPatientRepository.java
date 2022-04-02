package com.emr.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import com.emr.pojo.Patient;

public interface MyPatientRepository extends JpaRepository<Patient,Integer>{

	public Patient findByLoginId(String uname);
	//public Patient findByPassword(String password);
	
//	@Transactional
//	@Modifying
//	@Query("UPDATE Patient SET firstName = :firstName,lastName = :lastName,dateOfBirth = :dateOfBirth,gender = :gender,phoneNo = :phoneNo,address = :address,bloodGroup = :bloodGroup,profilePhoto = :profilePhoto WHERE loginId = :loginId")
//	Integer updatePriceByName(String firstName, String lastName, String dateOfBirth, String gender, String phoneNo,
//			 String address, String bloodGroup,Blob profilePhoto,String loginId);
	
//	 @Query(value="UPDATE patient_info_tbl SET first_name =:firstName,last_name =:lastName,dob =:dateOfBirth,gender =:gender,contact_no =:phoneNo,address =:address,blood_group =:bloodGroup,profile_photo =:profilePhoto WHERE login_id =:loginId;",nativeQuery = true)
//	 
//	 public Patient getUserByUserId(@Param("firstName") String firstName,@Param("lastName") String lastName,@Param("dateOfBirth") Date dateOfBirth,
//			 @Param("gender") String gender,@Param("phoneNo") String phoneNo,@Param("address") String address,@Param("bloodGroup") String bloodGroup,@Param("profilePhoto") Blob profilePhoto,@Param("loginId") String loginId);
}
















