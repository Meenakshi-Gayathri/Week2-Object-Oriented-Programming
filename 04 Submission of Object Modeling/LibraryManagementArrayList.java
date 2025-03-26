import java.util.ArrayList;

class Book {
    int isbn;
    String title;
    String author;

    public Book(int isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    String name;
    ArrayList<Book> books; 

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            b.display();            
        }
    }
}

public class LibraryManagementArrayList {
    public static void main(String[] args) {
        
        Book b1 = new Book(123, "C", "Y.K.");
        Book b2 = new Book(234, "C++", "Y.K.");
        Book b3 = new Book(345, "Java", "James Gosling");
       
        Library library = new Library("City Central Library");
        
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        
        library.displayBooks();
    }
}
