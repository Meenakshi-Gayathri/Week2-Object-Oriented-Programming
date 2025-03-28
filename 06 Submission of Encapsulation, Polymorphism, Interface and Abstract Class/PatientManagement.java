interface MedicalRecord {
    void addRecord();
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Inpatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;

    public Inpatient(int patientId, String name, int age, int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    public double calculateBill() {
        return daysAdmitted * roomChargePerDay;
    }

    public void addRecord() {
        System.out.println("Inpatient medical record added.");
    }

    public void viewRecords() {
        System.out.println("Viewing inpatient medical records.");
    }
}

class Outpatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public Outpatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    public void addRecord() {
        System.out.println("Outpatient medical record added.");
    }

    public void viewRecords() {
        System.out.println("Viewing outpatient medical records.");
    }
}

public class PatientManagement {
    public static void main(String[] args) {
        Patient in = new Inpatient(101, "Alice", 30, 5, 2000.0);
        Patient out = new Outpatient(102, "Bob", 25, 500.0);

        Patient[] patients = {in, out};

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Total Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) p;
                record.addRecord();
                record.viewRecords();
            }
            System.out.println();
        }
    }
}
