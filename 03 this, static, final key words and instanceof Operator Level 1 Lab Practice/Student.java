import java.util.*;

public class Student {
    static String universityName;
    String name;
    final int rollNumber;
    char grade;
    static int totalCount = 0;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalCount++;
    }

    public static int displayTotalStudents() {
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter University Name:");
        universityName = in.nextLine();
        System.out.println("Enter Student Name:");
        String name = in.nextLine();
        System.out.println("Enter Roll Number:");
        int rollNumber = in.nextInt();
        in.nextLine(); 
        System.out.println("Enter Grade (A/B/C/etc):");
        char grade = in.next().charAt(0);

        Student s = new Student(name, rollNumber, grade);

        if (s instanceof Student) {
            System.out.println("Student Details");
            System.out.println("University: " + universityName);
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
            System.out.println("Total Students: " + Student.displayTotalStudents());
        } else {
            System.out.println("Invalid student details");
        }

        in.close();
    }
}
