package hospitalmanagement;

import java.util.List;
import java.util.ArrayList;

public class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Department> departments = new ArrayList<>();

    public Hospital(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void showHospitalDetails() {
        System.out.println("Hospital Name: " + name);
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println("- " + department.name);
        }
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName() + " (Specialization: " + doctor.getspecialization() + ")");
        }
    }
}
