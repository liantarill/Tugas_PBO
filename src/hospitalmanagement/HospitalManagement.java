/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospitalmanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class HospitalManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String showCurrentDate = currentDateTime.format(formatter);
        System.out.println("-----> Date : " + showCurrentDate + " <-----");
        System.out.println("\n\n");

        // buat objek rs
        Hospital hospital = new Hospital("City Hospital");

        // buat objek department
        Department cardiology = new Department("Cardiology");
        Department surgery = new Department("Surgery");
        hospital.addDepartment(cardiology);
        hospital.addDepartment(surgery);

        // objek dokter
        Doctor doctor1 = new Doctor("Dr. Lian", 45, "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Ucup", 50, "Surgeon");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // objek pasien
        Patient Randi = new Patient("Randi", 30, "Heart Disease");

        // output menu hospital
        hospital.showHospitalDetails();
        System.out.println();

        Appointment appointment = new Appointment(doctor1, Randi, "23-12-2024");
        doctor1.addAppointment(appointment);
        // appointment.showDetails();

        System.out.println();
        System.out.println();

        Appointment appointment2 = new Appointment(doctor1, Randi, "23-12-2024");
        doctor1.addAppointment(appointment2);
        // appointment2.showDetails();

        // try {
        // LocalDateTime inputDateTime = LocalDateTime.parse(dateAppointment,
        // formatter);

        // // dicek apakah udah lewat
        // if (inputDateTime.isAfter(currentDateTime)) {

        // Appointment appointment = new Appointment(doctor1, Randi, dateAppointment);
        // doctor1.addAppointment(appointment);
        // appointment.showDetails();

        // System.out.println();
        // System.out.println();

        // Appointment appointment2 = new Appointment(doctor1, Randi, dateAppointment2);
        // doctor1.addAppointment(appointment2);
        // appointment2.showDetails();

        // } else {
        // System.out.println("The input date and time is NOT after the current date and
        // time.");
        // }

        // } catch (Exception e) {
        // System.out.println("Invalid date and time format. Please use dd-MM-yyyy.");
        // }
    }

}
