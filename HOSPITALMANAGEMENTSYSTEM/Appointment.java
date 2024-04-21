package HOSPITALMANAGEMENTSYSTEM;

import java.util.ArrayList;

public class Appointment {

	ArrayList<AppointmentRecord> appointments;
	
	public Appointment() {
        this.appointments = new ArrayList<>();
    }

	public void scheduleAppointment(String patientId, String doctorId, String dateAppointment) {

		if (appointments.isEmpty()) {
			appointments.add(new AppointmentRecord(patientId, doctorId, dateAppointment));
		} else {
			boolean test = true;
			for (AppointmentRecord appointment : appointments) {
				if (appointment.getDoctorId().equalsIgnoreCase(doctorId)
						&& appointment.getDateAppointment().equals(dateAppointment)) {
					test = false;
					break;
				}
			}
			if (test == false) {
				appointments.add(new AppointmentRecord(patientId, doctorId, dateAppointment));
			} else {
				System.out.println("Doctor is not available");
			}
		}
	}

	public void cancelAppointment(String dateAppointment) {
		for (AppointmentRecord appointmentRecord : appointments) {
			if (appointmentRecord.getDateAppointment().equals(dateAppointment)) {
				appointments.remove(appointmentRecord);
				System.out.println("Appointment on " + dateAppointment + "th canceled.");
				return;
			}
		}
		System.out.println("No Appointment date is persent");
	}

	public ArrayList<AppointmentRecord> displayAppointmentByDoctor(String doctorId) {
		ArrayList<AppointmentRecord> list = new ArrayList<>();
		for (AppointmentRecord appointment : appointments) {
			if (appointment.getDoctorId().equals(doctorId)) {
				list.add(appointment);
			}
		}
		return list;
	}

	public ArrayList<AppointmentRecord> displayAppointmentByPatient(String patientId) {
		ArrayList<AppointmentRecord> list = new ArrayList<>();
		for (AppointmentRecord appointment : appointments) {
			if (appointment.getPatientId().equals(patientId)) {
				list.add(appointment);
			}
		}
		return list;
	}

}
