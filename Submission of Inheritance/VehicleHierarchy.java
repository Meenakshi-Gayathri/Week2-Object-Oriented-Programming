import java.util.*;

class Vehicle {
    double maxSpeed;
    String fuelType;

    public Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Speed: " + maxSpeed);
        System.out.println("Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    public Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    public Truck(double maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCar;

    public Motorcycle(double maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Car details (Max Speed, Fuel Type, Seat Capacity):");
        Car car = new Car(in.nextDouble(), in.next(), in.nextInt());
        
        System.out.println("Enter Truck details (Max Speed, Fuel Type, Load Capacity in tons):");
        Truck truck = new Truck(in.nextDouble(), in.next(), in.nextDouble());
        
        System.out.println("Enter Motorcycle details (Max Speed, Fuel Type, Has Sidecar - true/false):");
        Motorcycle motorcycle = new Motorcycle(in.nextDouble(), in.next(), in.nextBoolean());

        Vehicle[] vehicles = {car, truck, motorcycle};

        System.out.println("\nVehicle Details:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}
