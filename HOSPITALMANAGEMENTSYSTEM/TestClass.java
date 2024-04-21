package HOSPITALMANAGEMENTSYSTEM;

public class TestClass {

	public static void main(String[] args) {
		// Create instances of Hospital, Patient, Doctor, and Appointment classes
		Hospital hospital = new Hospital();

		Patient patient1 = new Patient("John Doe", 35, "Male", "1234567890");
		Patient patient2 = new Patient("Jane Smith", 45, "Female", "9876543210");

		Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist", "9876543210");
		Doctor doctor2 = new Doctor("Dr. Johnson", "Pediatrician", "1234567890");

		// Add patients and doctors to the hospital
		hospital.addPatient(patient1);
		hospital.addPatient(patient2);

		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor2);

		// Display all patients and doctors in the hospital
		System.out.println("All Patients:");
		hospital.displayAllPatients();

		System.out.println("\nAll Doctors:");
		hospital.displayAllDoctors();

		// Schedule an appointment
		hospital.scheduleAppointment(patient1.getPatientId(), doctor1.getDoctorId(), "2024-04-25");

		// Display appointments for a doctor
//		System.out.println("\nAppointments for Doctor " + doctor1.getDoctorName() + ":");
//		hospital.displayAppointmentByDoctor(doctor1.getDoctorId());
//
//		// Display appointments for a patient
//		System.out.println("\nAppointments for Patient " + patient1.getPatientName() + ":");
//		hospital.displayAppointmentByPatient(patient1.getPatientId());
	}

}
