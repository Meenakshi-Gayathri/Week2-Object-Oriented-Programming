interface Taxable {
 double calculateTax();
 String getTaxDetails();
}

abstract class Product {
 private int productId;
 private String name;
 private double price;

 public Product(int productId, String name, double price) {
  this.productId = productId;
  this.name = name;
  this.price = price;
 }

 public int getProductId() {
  return productId;
 }

 public void setProductId(int productId) {
  this.productId = productId;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }

 public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
 public Electronics(int productId, String name, double price) {
  super(productId, name, price);
 }

 public double calculateDiscount() {
  return getPrice() * 0.10;
 }

 public double calculateTax() {
  return getPrice() * 0.18;
 }

 public String getTaxDetails() {
  return "Electronics Tax:18%";
 }
}

class Clothing extends Product implements Taxable {
 public Clothing(int productId, String name, double price) {
  super(productId, name, price);
 }

 public double calculateDiscount() {
  return getPrice() * 0.15;
 }

 public double calculateTax() {
  return getPrice() * 0.12;
 }

 public String getTaxDetails() {
  return "Clothing Tax:12%";
 }
}

class Groceries extends Product implements Taxable {
 public Groceries(int productId, String name, double price) {
  super(productId, name, price);
 }

 public double calculateDiscount() {
  return getPrice() * 0.20;
 }

 public double calculateTax() {
  return getPrice() * 0.11;
 }

 public String getTaxDetails() {
  return "Groceries Tax:11%";
 }
}

public class ECommercePlatform {
 public static void main(String[] args) {
  Product p1 = new Electronics(201, "Laptop", 80000);
  Product p2 = new Clothing(202, "T-Shirt", 2000);
  Product p3 = new Groceries(203, "Apples", 500);

  Product[] product = new Product[3];
  product[0] = p1;
  product[1] = p2;
  product[2] = p3;

  for (int i = 0; i < product.length; i++) {
   double tax = 0;
   if (product[i] instanceof Taxable) {
    tax = ((Taxable) product[i]).calculateTax();
   }
   double discount = product[i].calculateDiscount();
   double finalPrice = product[i].getPrice() + tax - discount;

   System.out.println("Product ID: " + product[i].getProductId());
   System.out.println("Product Name: " + product[i].getName());
   System.out.println("Base Price: " + product[i].getPrice());
   System.out.println("Discount: " + discount);
   System.out.println("Tax: " + tax);
   System.out.println("Final Price: " + finalPrice);
   System.out.println();
  }
 }
}
