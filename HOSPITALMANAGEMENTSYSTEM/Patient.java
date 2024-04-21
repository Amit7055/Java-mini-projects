package HOSPITALMANAGEMENTSYSTEM;

public class Patient {
	private String patientId;
	private String patientName;
	private int age;
	private String gender;
	private String contactNumber;
	static int id = 1;

	public Patient(String patientName, int age, String gender, String contactNumber) {
		this.patientId = "P00" + (id++);
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
