package com.emr.dto;

public class AccessDto {

	private int id;
	private String patientName;
	private String doctorName;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public AccessDto() {
		
	}
	public AccessDto(int id, String patientName,String  doctorName, String status) {
		
		this.id = id;
		this.doctorName = doctorName;
		this.patientName = patientName;
		this.status = status;
	}
	@Override
	public String toString() {
		return "AccessDto [id=" + id + ", patientName=" + patientName + ", doctorName=" + doctorName + ", status="
				+ status + "]";
	}
	
	
	
	
}
