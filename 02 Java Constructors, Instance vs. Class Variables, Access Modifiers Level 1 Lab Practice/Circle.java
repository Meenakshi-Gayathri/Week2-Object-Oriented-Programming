import java.util.*;

public class Circle{
 double radius;
 
 public Circle(){
  this(1.0); //default calling parametrised
  System.out.println("Radius default: " + radius);
 }
 
 public Circle(double radius){
  this.radius = radius;
  System.out.println("Radius parametrised: "+ radius);
 }
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the radius: ");
  double radius = in.nextDouble();
  Circle circle1 = new Circle(); //default
  Circle circle2 = new Circle(radius); //parametrised
 }
}