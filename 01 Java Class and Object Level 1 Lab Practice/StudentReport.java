import java.util.*;

public class StudentReport {
    String name;
    int rollNumber;
    double marks;

    StudentReport(String studentName, int studentRollNumber, double studentMarks) {
        name = studentName;
        rollNumber = studentRollNumber;
        marks = studentMarks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = input.nextInt();

        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();

        StudentReport student = new StudentReport(name, rollNumber, marks);
        student.displayDetails();
    }
}
