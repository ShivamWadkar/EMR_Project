package com.emr.pojo;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "document_tbl")
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "document_id")
	private int id;
	
	@Column(name = "document_type",columnDefinition = "VARCHAR(50)",nullable = false)
	private String documentType;
	
	@Column(name = "document_description",columnDefinition = "VARCHAR(255)",nullable = false)
	private String documentDescription;

	@Column(name = "document",columnDefinition = "MEDIUMBLOB",nullable = false)
	private Blob document;
	
	@Column(name = "document_date")
	private Date documentDate;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id",referencedColumnName = "patient_id")
	private Patient patient;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentDescription() {
		return documentDescription;
	}

	public void setDocumentDescription(String documentDescription) {
		this.documentDescription = documentDescription;
	}

	public Blob getDocument() {
		return document;
	}

	public void setDocument(Blob document) {
		this.document = document;
	}

	

	public Date getDocumentDate() {
		return documentDate;
	}

	public void setDocumentDate(Date documentDate) {
		this.documentDate = documentDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Patient getPatientId() {
		return patient;
	}

	public void setPatientId(Patient patient) {
		this.patient = patient;
	}

	public Document() {
		
	}
	
	
	
	public Document(int id, String documentType, String documentDescription, Blob document, Date documentDate,
			Patient patient) {

		this.id = id;
		this.documentType = documentType;
		this.documentDescription = documentDescription;
		this.document = document;
		this.documentDate = documentDate;
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", documentType=" + documentType + ", documentDescription=" + documentDescription
				+ ", document=" + document + ", documentDate=" + documentDate + ", patient=" + patient + "]";
	}

	
}
