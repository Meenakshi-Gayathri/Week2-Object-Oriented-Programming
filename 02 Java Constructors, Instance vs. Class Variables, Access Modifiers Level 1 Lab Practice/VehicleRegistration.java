import java.util.*;

public class VehicleRegistration {
    String ownerName;
    String vehicleType;

    public static double registrationFee = 1000.0;

    public VehicleRegistration(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;    
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);    
    }

    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Owner Name: ");
        String ownerName = in.nextLine();

        System.out.print("Enter vehicle type: ");
        String vehicleType = in.nextLine();

        VehicleRegistration vr = new VehicleRegistration(ownerName, vehicleType);
        vr.displayVehicleDetails();

        System.out.println("Registration Fee: " + registrationFee);

        System.out.print("Do you want to update the Registration Fee? (yes/no): ");
        String choice = in.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("New Registration Fee: ");
            double newRegistrationFee = in.nextDouble();
            in.nextLine();  
            updateRegistrationFee(newRegistrationFee);
        }

        System.out.println("Updated Registration Fee: " + registrationFee);
        in.close();
    }
}
