interface GPS {
    void getCurrentLocation();
    void updateLocation();
}

abstract class Vehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}

class Car extends Vehicle implements GPS {
    public Car(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Car current location fetched");
    }

    public void updateLocation() {
        System.out.println("Car location updated");
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Bike current location fetched");
    }

    public void updateLocation() {
        System.out.println("Bike location updated");
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(int vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }

    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    public void getCurrentLocation() {
        System.out.println("Auto current location fetched");
    }

    public void updateLocation() {
        System.out.println("Auto location updated");
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle car = new Car(1, "Rahul", 15.0);
        Vehicle bike = new Bike(2, "Anita", 10.0);
        Vehicle auto = new Auto(3, "Suresh", 12.0);

        Vehicle[] rides = {car, bike, auto};
        double[] distances = {10.5, 5.0, 7.2};

        for (int i = 0; i < rides.length; i++) {
            rides[i].getVehicleDetails();
            System.out.println("Fare for " + distances[i] + " km: " + rides[i].calculateFare(distances[i]));
            if (rides[i] instanceof GPS) {
                GPS gps = (GPS) rides[i];
                gps.getCurrentLocation();
                gps.updateLocation();
            }
            System.out.println();
        }
    }
}
