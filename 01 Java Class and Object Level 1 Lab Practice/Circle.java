import java.util.*;
import java.lang.Math;

public class Circle{
 double radius;
 double circumference;
 double area;
 Circle(double radius){
  circumference = 2*Math.PI*radius;
  area = Math.PI * Math.pow(radius,2);
  
 }
 
 void displaydetails(){
  System.out.println(circumference);
  System.out.println(area);
  
 }

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  double radius = input.nextDouble();
  
  Circle cir = new Circle(radius);
  cir.displaydetails();
 }
}