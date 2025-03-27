import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String collegeName;

    public Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary);
        this.collegeName = collegeName;
    }

    
    public void displayDetails() {
        super.displayDetails();
        System.out.println("College: " + collegeName);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Manager details (Name, ID, Salary, Team Size):");
        Manager manager = new Manager(in.next(), in.nextInt(), in.nextDouble(), in.nextInt());
        
        System.out.println("Enter Developer details (Name, ID, Salary, Programming Language):");
        Developer developer = new Developer(in.next(), in.nextInt(), in.nextDouble(), in.next());
        
        System.out.println("Enter Intern details (Name, ID, Salary, College Name):");
        Intern intern = new Intern(in.next(), in.nextInt(), in.nextDouble(), in.next());

        System.out.println("\nEmployee Details:");
        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}
