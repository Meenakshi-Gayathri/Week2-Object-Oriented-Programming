import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    public MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public void displayTicketDetails() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: Rs" + price);
    }

    public static boolean[] seats = new boolean[50];

    public static MovieTicket bookTicket(String movieName, int seatNumber, double price) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number! Please choose a seat between 1 and 50.");
            return null;
        }

        if (seats[seatNumber - 1]) {
            System.out.println("Seat number " + seatNumber + " is already booked. Please choose another seat.");
            return null;
        }

        seats[seatNumber - 1] = true;
        return new MovieTicket(movieName, seatNumber, price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueBooking = true;

        System.out.print("Enter movie name: ");
        String movieName = scanner.nextLine();

        while (continueBooking) {
            System.out.print("Enter seat number (1-50): ");
            int seatNumber = scanner.nextInt();

            System.out.print("Enter ticket price: Rs");
            double price = scanner.nextDouble();

            MovieTicket ticket = bookTicket(movieName, seatNumber, price);
            if (ticket != null) {
                ticket.displayTicketDetails();
            }

            System.out.print("Do you want to book another ticket? (yes/no): ");
            scanner.nextLine(); 
            String response = scanner.nextLine().trim().toLowerCase();
            continueBooking = response.equals("yes");
        }

        System.out.println("Thank you for using the Movie Booking System!");
        scanner.close();
    }
}
