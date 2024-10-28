package hospitalmanagement;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public Appointment(Doctor doctor, Patient patient, String dateTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.dateTime = dateTime;
    }

    public void showDetails() {

        System.out.println("Appointment Details:");
        System.out.println("Doctor: " + doctor.getName() + " - Specialization: " + doctor.getspecialization());
        System.out.println("Patient: " + patient.getName() + " - Illness: " + patient.getIllnes());
        if (doctor.checkAvaibility(dateTime)) {
            System.out.println("Scheduled Date and Time: " + dateTime);
        } else {
            System.out.println(doctor.getName() + " Already full for " + dateTime);
        }
    }

}