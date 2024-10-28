package hospitalmanagement;

import java.util.List;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;

public class Doctor extends Person {
    private String specialization;
    private List<Appointment> appointments;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

    public String getspecialization() {
        return specialization;
    }

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        if (checkAvaibility(appointment.getDateTime())) {
            appointment.showDetails();
            appointments.add(appointment);
        } else {
            appointment.showDetails();
        }

    }

    public boolean checkAvaibility(String date) {
        for (Appointment appointment : appointments) {
            if (appointment.getDateTime().equals(date)) {
                return false;
            }
        }

        return true;
    }

}