import java.util.*;

class Device {
    int deviceId;
    String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device {
    int temperatureSetting;

    public Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Device ID:");
        int deviceId = in.nextInt();
        in.nextLine();

        System.out.println("Enter Status:");
        String status = in.nextLine();

        System.out.println("Enter Temperature Setting:");
        int temperatureSetting = in.nextInt();

        Thermostat thermostat = new Thermostat(deviceId, status, temperatureSetting);

        System.out.println("\nDevice Details:");
        thermostat.displayStatus();
    }
}
