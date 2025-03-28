interface Reservable {
    void reserveItem();
    void checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println("ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
    }
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 15;
    }

    @Override
    public void reserveItem() {
        System.out.println("Book reserved");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Book Available");
    }
}

class Magazine extends LibraryItem implements Reservable {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public void reserveItem() {
        System.out.println("Magazine reserved");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Magazine Available");
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 10;
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved");
    }

    @Override
    public void checkAvailability() {
        System.out.println("DVD Available");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem book = new Book(1, "1984", "George Orwell");
        LibraryItem magazine = new Magazine(2, "Time", "Various");
        LibraryItem dvd = new DVD(3, "Inception", "Christopher Nolan");

        LibraryItem[] items = {book, magazine, dvd};

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem();
                ((Reservable) item).checkAvailability();
            }

            System.out.println();
        }
    }
}
