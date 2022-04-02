package com.emr.dto;

public class AccessDto {

	private int id;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public AccessDto() {
		
	}
	public AccessDto(int id, String doctorName, String status) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.status = status;
	}
	@Override
	public String toString() {
		return "AccessDto [id=" + id + ", doctorName=" + doctorName + ", status=" + status + "]";
	}
	
	
	
}
