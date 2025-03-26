import java.util.ArrayList;

class Patient {
    String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    String name;
    ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) { // object of a class passed
        patients.add(patient);
    }

    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting with Patient " + patient.getName() + ".");
    }

    public void displayConsultations() {
        for (Patient patient : patients) {
            consult(patient);
        }
    }
}

class Hospital {
    String name;
    ArrayList<Doctor> doctors;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showConsultations() {
        for (Doctor doctor : doctors) {
            doctor.displayConsultations();
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");
        Patient p3 = new Patient("Charlie");

        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. Johnson");

        d1.addPatient(p1);
        d1.addPatient(p2);
        d2.addPatient(p2);
        d2.addPatient(p3);

        Hospital hospital = new Hospital("City Hospital");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.showConsultations();
    }
}
