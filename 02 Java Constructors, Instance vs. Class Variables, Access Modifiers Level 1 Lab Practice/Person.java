import java.util.*;

public class Person{
 String name;
 String dateofbirth;
 int age;
 
 public Person(String name,String dateofbirth,int age){
  this.name = name;
  this.dateofbirth = dateofbirth;
  this.age = age;
  
 }
 
 public Person(Person other){
  this.name = other.name;
  this.dateofbirth = other.dateofbirth;
  this.age = other.age;
  System.out.println("Copy constructor executed \n"+ this.name + "\n" + this.dateofbirth +  "\n" + this.age);
 }
 
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String name = in.nextLine();
  String dateofbirth = in.nextLine();
  int age = in.nextInt();
  in.nextLine();
  Person person = new Person(name,dateofbirth,age);
  Person copy = new Person(person);
 }
}