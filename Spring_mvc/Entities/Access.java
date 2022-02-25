package emr.pojo;

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
@Table(name = "access_tbl")
public class Access {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "access_id")
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_id")
	private int patientId;
	
	@ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_id")
	private int doctorId;
	
	@Column(name = "access_status")
	private int accessStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getAccessStatus() {
		return accessStatus;
	}

	public void setAccessStatus(int accessStatus) {
		this.accessStatus = accessStatus;
	}

	@Override
	public String toString() {
		return "Access [id=" + id + ", patientId=" + patientId + ", doctorId=" + doctorId + ", accessStatus="
				+ accessStatus + "]";
	}
	
	
}
