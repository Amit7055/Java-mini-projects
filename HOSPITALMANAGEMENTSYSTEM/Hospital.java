package HOSPITALMANAGEMENTSYSTEM;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {

	HashMap<String, Patient> patients;
	HashMap<String, Doctor> doctors;

	public Hospital() {
		this.patients = new HashMap<>();
		this.doctors = new HashMap<>();
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getPatientId(), patient);
	}

	public void removePatient(String patientId) {
		if (patients.containsKey(patientId)) {
			patients.remove(patientId);
			System.out.println("Patient remove successfully....");
		} else {
			System.out.println("Patient ID not found....");
		}
	}

	public void updatePatient(String patientId, Patient updatePatient) {
		if (patients.containsKey(patientId)) {
			patients.remove(patientId);
			patients.put(updatePatient.getPatientId(), updatePatient);
			System.out.println("Patient update successfully....");
		} else {
			System.out.println("Patient ID not found....");
		}
	}

	public void addDoctor(Doctor doctor) {
		doctors.put(doctor.getDoctorId(), doctor);
	}

	public void removeDoctor(String doctorId) {
		if (doctors.containsKey(doctorId)) {
			doctors.remove(doctorId);
			System.out.println("Doctor remove successfully....");
		} else {
			System.out.println("Doctor ID not found....");
		}
	}

	public void updateDoctor(String doctorId, Doctor updatedoctor) {
		if (doctors.containsKey(doctorId)) {
			doctors.remove(doctorId);
			doctors.put(updatedoctor.getDoctorId(), updatedoctor);
			System.out.println("Doctor update successfully....");
		} else {
			System.out.println("Doctor ID not found....");
		}
	}

	public ArrayList<Doctor> searchDoctorBySpecialization(String specialization) {
		ArrayList<Doctor> list = new ArrayList<>();
		for (Doctor doctor : doctors.values()) {
			if (doctor.getSpecialization().equalsIgnoreCase(specialization))
				;
			list.add(doctor);
		}
		return list;
	}

	public void scheduleAppointment(String patientId, String doctorId, String dateAppointment) {
		if (doctors.containsKey(doctorId) && patients.containsKey(patientId)) {
			Appointment appointment = new Appointment();
			appointment.scheduleAppointment(patientId, doctorId, dateAppointment);
		}
	}

	public void displayAllPatients() {
		for (Patient patient : patients.values()) {
			System.out.println("Patient Id : " + patient.getPatientId());
			System.out.println("Patient Name : " + patient.getPatientName());
			System.out.println("Patient Age : " + patient.getAge());
			System.out.println("Patient Gender : " + patient.getGender());
			System.out.println("Patient Contact Number : " + patient.getContactNumber());
		}
	}

	public void displayAllDoctors() {
		for (Doctor doctor : doctors.values()) {
			System.out.println("Doctor Id : " + doctor.getDoctorId());
			System.out.println("Doctor Name : " + doctor.getDoctorName());
			System.out.println("Doctor Specialization : " + doctor.getSpecialization());
			System.out.println("Doctor Contact Number : " + doctor.getContactNumber());
		}
	}

}
