package HOSPITALMANAGEMENTSYSTEM;

import java.util.Date;

public class AppointmentRecord {

	private String patientId;
	private String doctorId;
	private String appointmentId;
	private String dateAppointment;
	static int id = 1;

	public AppointmentRecord(String patientId, String doctorId, String dateAppointment) {
		this.patientId = patientId;
		this.doctorId = doctorId;
		this.appointmentId = "AP00" + (id++);
		this.dateAppointment = dateAppointment;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getDateAppointment() {
		return dateAppointment;
	}

	public void setDateAppointment(String dateAppointment) {
		this.dateAppointment = dateAppointment;
	}
	
	
	
}
