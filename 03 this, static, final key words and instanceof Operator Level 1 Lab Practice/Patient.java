import java.util.*;

public class Patient {
    static String hospitalName;
    String name;
    int age;
    String ailment;
    final int patientID;
    static int patientCount = 0;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        patientCount++;
    }

    public static int getTotalPatients() {
        return patientCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Hospital Name:");
        hospitalName = in.nextLine();

        System.out.println("Enter Patient Name:");
        String name = in.nextLine();
        System.out.println("Enter Age:");
        int age = in.nextInt();
        in.nextLine(); 
        System.out.println("Enter Ailment:");
        String ailment = in.nextLine();
        System.out.println("Enter Patient ID:");
        int id = in.nextInt();

        Patient p = new Patient(name, age, ailment, id);

        if (p instanceof Patient) {
            System.out.println("Patient Details");
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        } else {
            System.out.println("Invalid patient data");
        }

        in.close();
    }
}
