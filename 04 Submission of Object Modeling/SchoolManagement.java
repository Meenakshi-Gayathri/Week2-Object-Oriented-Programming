import java.util.ArrayList;

class Course {
    String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    void displayCourse() {
        System.out.println("Course: " + courseName);
    }
}
//Association
class Student {
    String name;
    ArrayList<Course> courses; //many students can enroll many course

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    void enrollInCourse(Course course) {
        courses.add(course);
    }

    void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            course.displayCourse();
        }
    }
}
//Aggregation - school can func still w/o student
class School {
    ArrayList<Student> students; //school can have many students 

    public School() {
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void displayStudents() {
        for (Student student : students) {
            student.displayCourses();
        }
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        Course c3 = new Course("History");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.enrollInCourse(c1);
        s1.enrollInCourse(c2);
        s2.enrollInCourse(c2);
        s2.enrollInCourse(c3);

        School school = new School();
        school.addStudent(s1);
        school.addStudent(s2);

        school.displayStudents();
    }
}
