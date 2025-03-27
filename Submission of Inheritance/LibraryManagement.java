import java.util.*;

class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    public Author(String name, String bio, String title, int publicationYear) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter book title:");
        String title = in.nextLine();
        
        System.out.println("Enter publication year:");
        int publicationYear = in.nextInt();
        in.nextLine(); 
        
        System.out.println("Enter author name:");
        String name = in.nextLine();
        
        System.out.println("Enter author bio:");
        String bio = in.nextLine();

        Author author = new Author(name, bio, title, publicationYear);

        System.out.println("\nBook Details:");
        author.displayInfo();
    }
}
