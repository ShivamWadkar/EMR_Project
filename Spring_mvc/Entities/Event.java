package emr.pojo;


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
@Table(name = "event_tbl")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private int id;
	
	@Column(name = "event_type",columnDefinition = "VARCHAR(50)",nullable = false)
	private String eventType;
	
	@Column(name = "event_description",columnDefinition = "VARCHAR(255)",nullable = false)
	private String eventDescription;

	@Column(name = "date")
	private Date date;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private int patientId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", eventType=" + eventType + ", eventDescription=" + eventDescription + ", date="
				+ date + ", patientId=" + patientId + "]";
	}

	
}
