import java.util.*;

public class CarRentalSystem{
 String customerName;
 String carModel;
 int rentalDays;
 double dailyRate;
 
 public CarRentalSystem(String customerName,String carModel,int rentalDays,double dailyRate){
  this.customerName = customerName;
  this.carModel = carModel;
  this.rentalDays = rentalDays;
  this.dailyRate = dailyRate;
 }
 
 public double calculateTotalCost(){
  double total_cost = this.rentalDays * this.dailyRate;
  return total_cost;
 }
 
 public static void main (String[] args){
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the name: ");
  String customerName = in.nextLine();
  System.out.println("Enter the model: ");
  String carModel = in.nextLine();
  System.out.println("Enter the days: ");
  int rentalDays = in.nextInt();
  System.out.println("Enter the daily rate: ");
  double dailyRate = in.nextDouble();
  
  CarRentalSystem crs = new CarRentalSystem(customerName,carModel,rentalDays,dailyRate);
  System.out.println("Total cost = "+crs.calculateTotalCost());
  in.close();
 }
}