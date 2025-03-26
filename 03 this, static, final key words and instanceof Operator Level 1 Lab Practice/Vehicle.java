import java.util.*;

public class Vehicle {
    static double registrationFee;
    String ownerName;
    String vehicleType;
    final int registrationNumber;

    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Owner Name:");
        String owner = in.nextLine();
        System.out.println("Enter Vehicle Type:");
        String type = in.nextLine();
        System.out.println("Enter Registration Number:");
        int regNo = in.nextInt();

        Vehicle v = new Vehicle(owner, type, regNo);

        System.out.println("Enter the new registration fee:");
        double fee = in.nextDouble();
        Vehicle.updateRegistrationFee(fee);

        if (v instanceof Vehicle) {
            System.out.println("Vehicle Registration Details");
            System.out.println("Owner Name: " + v.ownerName);
            System.out.println("Vehicle Type: " + v.vehicleType);
            System.out.println("Registration Number: " + v.registrationNumber);
            System.out.println("Registration Fee: " + Vehicle.registrationFee);
        } else {
            System.out.println("Invalid vehicle details");
        }

        in.close();
    }
}
