import java.util.*;

public class LibraryBookSystem {
    String title;
    String author;
    double price;
    boolean availability;

    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter book details:");
        String title = in.nextLine();
        String author = in.nextLine();
        double price = in.nextDouble();
        in.nextLine(); 
        LibraryBookSystem book = new LibraryBookSystem(title, author, price);
        
        if (book.borrowBook()) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
        
        System.out.println("Enter book details again:");
        String newTitle = in.nextLine();
        String newAuthor = in.nextLine();
        double newPrice = in.nextDouble();
        
        if (title.equals(newTitle) && author.equals(newAuthor) && price == newPrice) {
            System.out.println("Book not available.");
        } else {
            System.out.println("New book entered.");
        }
        
        in.close();
    }
}
