import java.util.ArrayList;

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
		//operate the obj that called method,implicit ref 
        course.addStudent(this); //refer curr stud obj(refer tp curr instance of the class)
		//curr obj acts on itself
    }
}

class Course {
    String name;
    Professor professor;
    ArrayList<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + professor.name);
        System.out.println("Enrolled Students: ");
        for (Student student : students) {
            System.out.println(student.name);
        }
		System.out.println("\n");
    }
}

class Professor {
    String name;

    public Professor(String name) {
        this.name = name;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");

        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        student1.enroll(course1);
        student2.enroll(course1);
        student2.enroll(course2);

        course1.showCourseDetails();
        course2.showCourseDetails();
    }
}
