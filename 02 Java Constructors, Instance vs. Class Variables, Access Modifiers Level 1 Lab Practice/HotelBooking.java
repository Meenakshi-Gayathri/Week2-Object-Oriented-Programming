import java.util.*;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        this.guestName = "John";
        this.roomType = "Super Deluxe";
        this.nights = 1;
        System.out.println("Default constructor executed:\nGuest Name: " + this.guestName +
                           "\nRoom Type: " + this.roomType +
                           "\nNights: " + this.nights);
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("Parameterized constructor executed:\nGuest Name: " + this.guestName +
                           "\nRoom Type: " + this.roomType +
                           "\nNights: " + this.nights);
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        System.out.println("Copy constructor executed:\nGuest Name: " + this.guestName +
                           "\nRoom Type: " + this.roomType +
                           "\nNights: " + this.nights);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Guest Name:");
        String guestName = in.nextLine();
        System.out.println("Enter Room Type:");
        String roomType = in.nextLine();
        System.out.println("Enter Number of Nights:");
        int nights = in.nextInt();
        HotelBooking hotel = new HotelBooking();
        HotelBooking hotel1 = new HotelBooking(guestName, roomType, nights);
        HotelBooking copy = new HotelBooking(hotel1);
        in.close();
    }
}
