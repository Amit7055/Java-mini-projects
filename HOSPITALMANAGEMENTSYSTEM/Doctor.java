package HOSPITALMANAGEMENTSYSTEM;

public class Doctor {
	private String doctorId;
	private String doctorName;
	private String specialization;
	private String contactNumber;
	static int idd = 1;
	public Doctor(String doctorName, String specialization, String contactNumber) {
		this.doctorId = "D00" + (idd++);
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.contactNumber = contactNumber;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
