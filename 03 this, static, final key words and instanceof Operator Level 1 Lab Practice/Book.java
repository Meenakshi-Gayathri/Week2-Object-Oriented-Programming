import java.util.*;

public class Book{
 static String libraryName;
 String title;
 String author;
 final int isbn;
 
 public Book(String title,String author,int isbn){
  this.title = title;
  this.author = author;
  this.isbn = isbn;
 }
 
 public static String displayLibraryName(){
  return libraryName;
 }
 
 public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the library name: ");
        libraryName = in.nextLine();
		System.out.println("Enter the title: ");
        String title = in.nextLine();
		System.out.println("Enter the author: ");
        String author = in.nextLine();
		System.out.println("Enter the isbn number: ");
		int isbn = in.nextInt();

        Book book = new Book(title,author,isbn);	
		
        if (book instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
			System.out.println("ISBN Number: " + book.isbn);
        } else {
            System.out.println("Invalid details");
        }
		in.close();
 }
}