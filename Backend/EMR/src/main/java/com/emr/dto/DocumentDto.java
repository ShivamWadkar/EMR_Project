package com.emr.dto;

import java.util.Arrays;

public class DocumentDto {
	
	
	private String name;
	private byte[] file;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	public DocumentDto() {
		
	}
	
	public DocumentDto(String type, byte[] file) {
		super();
		this.name = type;
		this.file = file;
	}
	@Override
	public String toString() {
		return "DocumentDto [type=" + name + ", file=" + Arrays.toString(file) + "]";
	}
	
	
	
	

}
