import java.util.ArrayList;

class Employee{
 String name;
 
 public Employee(String name){
  this.name = name;
 }
 void display(){
  System.out.println("Emp Name: "+name);
 }
}

class Department{
 String deptName;
 ArrayList<Employee> employees; //dept has many employees(only declared)
 
 public Department(String deptName){
  this.deptName = deptName;
  employees = new ArrayList<>();//emp list is initialised here only
 }
 void addEmployee(String name){
  employees.add(new Employee(name));
 }
 void display(){
  System.out.println("Department: " + deptName);
  for(Employee e:employees){
   e.display();
  }
 }
}

class Company{
 String compName;
 ArrayList<Department> departments; //Array list is declared and initialised inside the class
 public Company(String compName){
  this.compName = compName;
  departments = new ArrayList<>();
 }
 void addDepartment(String deptName){
  departments.add(new Department(deptName));
 }
 Department getDepartment(int index){
  if (index >= 0 && index < departments.size()) {
    return departments.get(index); //display diff dept as index(0 = sales)
  }
  return null;
 }
 void display(){
  System.out.println("Company: " + compName);
  for (Department d : departments) {
    d.display();
  }
 }
}

public class CompanyManagement{
 public static void main(String[] args){
  Company c = new Company("ABC");
  c.addDepartment("Sales");
  Department sales = c.getDepartment(0);
  sales.addEmployee("John");
  c.display();
 }
}