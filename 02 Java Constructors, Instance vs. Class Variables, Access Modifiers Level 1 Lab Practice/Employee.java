import java.util.*;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }

    public class Manager extends Employee {

        public Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        public void displayManagerDetails() {
            super.displayEmployeeDetails();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int employeeID = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(employeeID, department, salary);
        employee.displayEmployeeDetails();

        System.out.print("Enter new Salary for Manager: ");
        double newSalary = scanner.nextDouble();

        Employee.Manager manager = employee.new Manager(employeeID, department, newSalary);
        manager.displayManagerDetails();

        scanner.close();
    }
}
