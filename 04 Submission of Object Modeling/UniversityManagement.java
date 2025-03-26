import java.util.ArrayList;

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
//Aggregation

class Department {
    String deptName;
    ArrayList<Faculty> facultyMembers;

    public Department(String deptName) {
        this.deptName = deptName;
        this.facultyMembers = new ArrayList<>();
    }

    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    void displayFaculty() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyMembers) {
            System.out.println(f.getName());
        }
    }
}
//Composition

class University {
    String uniName;
    ArrayList<Department> departments;

    public University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayDepartments() {
        System.out.println("University: " + uniName);
        for (Department dept : departments) {
            dept.displayFaculty();
        }
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Faculty f1 = new Faculty("Dr. Smith");
        Faculty f2 = new Faculty("Dr. Johnson");
        Faculty f3 = new Faculty("Dr. Davis");

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");

        d1.addFaculty(f1);
        d1.addFaculty(f2);
        d2.addFaculty(f2);
        d2.addFaculty(f3);

        University u = new University("XYZ University");
        u.addDepartment(d1);
        u.addDepartment(d2);

        u.displayDepartments();
    }
}
