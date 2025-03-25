import java.util.*;

public class Course {
    String courseName;
    int duration;
    double fee;

    public static String instituteName = "SRM";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration in months: " + duration);
        System.out.println("Fee: " + fee);
    }

    public static String updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
		return instituteName;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String courseName = in.nextLine();

        System.out.print("Enter Duration in months: ");
        int duration = in.nextInt();

        System.out.print("Enter Fee: ");
        double fee = in.nextDouble();

        Course c = new Course(courseName, duration, fee);
        c.displayCourseDetails();
		
		System.out.println("Institute Name: " + instituteName);
        in.nextLine();
        System.out.print("Do you want to update the institute name? (yes/no): ");
        String choice = in.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("New Institute Name: ");
            String newInstituteName = in.nextLine();
            updateInstituteName(newInstituteName);
        }
        
        in.close();
    }
}
