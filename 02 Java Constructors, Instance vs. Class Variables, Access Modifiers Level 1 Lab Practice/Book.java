import java.util.*;

public class Book{
 String title;
 String author;
 double price;
 public Book(String title,String author,double price){ //parametrized constructors
  this.title = title;
  this.author = author;
  this.price = price;
 }
 
 public Book(){
  this.title = "";
  this.author = "";
  this.price = 0.0;
 }
 
 public static void main(String[] args){
  Scanner in = new Scanner(System.in);
  String title = in.nextLine();
  String author = in.nextLine();
  double price = in.nextDouble();
  Book boo = new Book(title,author,price); 
  System.out.println(boo.title);
  System.out.println(boo.author);
  System.out.println(boo.price);
 }
}