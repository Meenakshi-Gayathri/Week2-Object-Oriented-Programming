import java.util.*;

public class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("RollNumber: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA()); 
    }

    public class PostgraduateStudent extends Student {
        private double CGPA;

        public PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
            this.CGPA = CGPA;
        }

        
        public void displayDetails() {
            super.displayDetails(); 
            System.out.println("Postgraduate CGPA: " + CGPA); 
        }
    }

    public static void main(String[] args) {
        
        Student student = new Student(1, "John Doe", 8.5);
        student.displayDetails();

        
        PostgraduateStudent pgStudent = student.new PostgraduateStudent(2, "Jane Doe", 9.0);
        pgStudent.displayDetails();
    }
}
