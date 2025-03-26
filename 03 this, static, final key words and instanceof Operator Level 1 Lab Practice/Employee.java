import java.util.*;

public class Employee {
    static String companyName;
    String name;
    final int id;
    String designation;
    static int totalEmployees = 0;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static int displayTotalEmployees() {
        return totalEmployees;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the company name: ");
        companyName = in.nextLine();

        System.out.println("Enter the name of Employee 1:");
        String name1 = in.nextLine();
        System.out.println("Enter the ID of Employee 1:");
        int id1 = in.nextInt();
        in.nextLine();
        System.out.println("Enter the designation of Employee 1:");
        String designation1 = in.nextLine();

        System.out.println("Enter the name of Employee 2:");
        String name2 = in.nextLine();
        System.out.println("Enter the ID of Employee 2:");
        int id2 = in.nextInt();
        in.nextLine();
        System.out.println("Enter the designation of Employee 2:");
        String designation2 = in.nextLine();

        Employee e1 = new Employee(name1, id1, designation1);
        Employee e2 = new Employee(name2, id2, designation2);

        if (e1 instanceof Employee) {
            System.out.println("\nEmployee 1 Details");
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee: " + e1.name);
            System.out.println("ID: " + e1.id);
            System.out.println("Designation: " + e1.designation);
        } else {
            System.out.println("Invalid details for e1");
        }

        if (e2 instanceof Employee) {
            System.out.println("\nEmployee 2 Details");
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee: " + e2.name);
            System.out.println("ID: " + e2.id);
            System.out.println("Designation: " + e2.designation);
        } else {
            System.out.println("Invalid details for e2");
        }

        in.close();
    }
}
