import java.util.*;

public class BookLibrary {
    public int ISBN;
    protected String title;
    private String author;

    public BookLibrary(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor()); 
    }

    public class EBook extends BookLibrary{
        private double fileSize;

        public EBook(int ISBN, String title, String author, double fileSize) {
            super(ISBN, title, author);
            this.fileSize = fileSize;
        }

        
        public void displayDetails() {
            super.displayDetails();
            System.out.println("File Size: " + fileSize + "MB");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ISBN: ");
        int ISBN = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        
        BookLibrary book = new BookLibrary(ISBN, title, author);
        book.displayDetails();

        System.out.print("Enter File Size for EBook (in MB): ");
        double fileSize = scanner.nextDouble();

        BookLibrary.EBook eBook = book.new EBook(ISBN, title, author, fileSize);
        eBook.displayDetails();
        
        scanner.close();
    }
}
