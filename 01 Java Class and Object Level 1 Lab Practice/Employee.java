import java.util.*;

public class Employee{
 String name;
 int id;
 double salary;
 Employee(String empname,int empid,double empsalary){
  name = empname;
  id = empid;
  salary = empsalary;
 }
 
 void displaydetails(){
  System.out.println(name);
  System.out.println(id);
  System.out.println(salary);
 }

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String empname = input.nextLine();
  int empid = input.nextInt();
  double empsalary = input.nextDouble();
  Employee emp = new Employee(empname,empid,empsalary);
  emp.displaydetails();
 }
}