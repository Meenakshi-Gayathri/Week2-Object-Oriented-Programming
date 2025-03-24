import java.util.*;
import java.lang.Math;

public class Book{
 String title;
 String author;
 double price;
 Book(String booktitle,String bookauthor,double bookprice){
  title=booktitle;
  author=bookauthor;
  price=bookprice;  
 }
 
 void displaydetails(){
  System.out.println("Book Details");
  System.out.println(title);
  System.out.println(author);
  System.out.println(price);
  
 }

public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String booktitle = input.nextLine();
  String bookauthor = input.nextLine();
  double bookprice = input.nextDouble();
  
  Book book = new Book(booktitle,bookauthor,bookprice);
  book.displaydetails();
 }
}