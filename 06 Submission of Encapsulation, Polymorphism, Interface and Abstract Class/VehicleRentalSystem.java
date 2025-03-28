interface Insurable {
 double calculateInsurance();
 void getInsuranceDetails();
}

abstract class Vehicle {
 private int vehicleNumber;
 private String type;
 private double rentalRate;

 public Vehicle(int vehicleNumber, String type, double rentalRate) {
  this.vehicleNumber = vehicleNumber;
  this.type = type;
  this.rentalRate = rentalRate;
 }

 public int getVehicleNumber() {
  return vehicleNumber;
 }

 public void setVehicleNumber(int vehicleNumber) {
  this.vehicleNumber = vehicleNumber;
 }

 public String getType() {
  return type;
 }

 public void setType(String type) {
  this.type = type;
 }

 public double getRentalRate() {
  return rentalRate;
 }

 public void setRentalRate(double rentalRate) {
  this.rentalRate = rentalRate;
 }

 public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
 private String insurancePolicy;

 public Car(int vehicleNumber, String type, double rentalRate, String insurancePolicy) {
  super(vehicleNumber, type, rentalRate);
  this.insurancePolicy = insurancePolicy;
 }

 public double calculateRentalCost(int days) {
  return getRentalRate() * days;
 }

 public double calculateInsurance() {
  return getRentalRate() * 0.05;
 }

 public void getInsuranceDetails() {
  System.out.println("Car Insurance Policy: " + insurancePolicy);
 }
}

class Bike extends Vehicle implements Insurable {
 private String insurancePolicy;

 public Bike(int vehicleNumber, String type, double rentalRate, String insurancePolicy) {
  super(vehicleNumber, type, rentalRate);
  this.insurancePolicy = insurancePolicy;
 }

 public double calculateRentalCost(int days) {
  return getRentalRate() * days * 0.9;
 }

 public double calculateInsurance() {
  return getRentalRate() * 0.02;
 }

 public void getInsuranceDetails() {
  System.out.println("Bike Insurance Policy: " + insurancePolicy);
 }
}

class Truck extends Vehicle implements Insurable {
 private String insurancePolicy;

 public Truck(int vehicleNumber, String type, double rentalRate, String insurancePolicy) {
  super(vehicleNumber, type, rentalRate);
  this.insurancePolicy = insurancePolicy;
 }

 public double calculateRentalCost(int days) {
  return getRentalRate() * days * 1.5;
 }

 public double calculateInsurance() {
  return getRentalRate() * 0.1;
 }

 public void getInsuranceDetails() {
  System.out.println("Truck Insurance Policy: " + insurancePolicy);
 }
}

public class VehicleRentalSystem {
 public static void main(String[] args) {
  Vehicle v1 = new Car(301, "Car", 2000, "CAR12345");
  Vehicle v2 = new Bike(302, "Bike", 500, "BIKE67890");
  Vehicle v3 = new Truck(303, "Truck", 4000, "TRUCK54321");

  Vehicle[] vehicle = new Vehicle[3];
  vehicle[0] = v1;
  vehicle[1] = v2;
  vehicle[2] = v3;

  for (int i = 0; i < vehicle.length; i++) {
   double rent = vehicle[i].calculateRentalCost(5);
   double insurance = 0;
   if (vehicle[i] instanceof Insurable) {
    insurance = ((Insurable) vehicle[i]).calculateInsurance();
    ((Insurable) vehicle[i]).getInsuranceDetails();
   }
   System.out.println("Vehicle Number: " + vehicle[i].getVehicleNumber());
   System.out.println("Vehicle Type: " + vehicle[i].getType());
   System.out.println("Rental Rate: " + vehicle[i].getRentalRate());
   System.out.println("Total Rental (5 days): " + rent);
   System.out.println("Insurance Amount: " + insurance);
   System.out.println();
  }
 }
}
	