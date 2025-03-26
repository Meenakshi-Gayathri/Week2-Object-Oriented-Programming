import java.util.*;

public class Product {
    static double discount;
    final int productId;
    String productName;
    double price;
    int quantity;

    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public double getDiscountedPrice() {
        return price - (price * discount / 100);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Product ID:");
        int id = in.nextInt();
        in.nextLine();
        System.out.println("Enter Product Name:");
        String name = in.nextLine();
        System.out.println("Enter Price:");
        double price = in.nextDouble();
        System.out.println("Enter Quantity:");
        int quantity = in.nextInt();

        Product p = new Product(id, name, price, quantity);

        System.out.println("Enter new discount percentage:");
        double newDiscount = in.nextDouble();
        Product.updateDiscount(newDiscount);

        if (p instanceof Product) {
            System.out.println("\n--- Product Details ---");
            System.out.println("Product ID: " + p.productId);
            System.out.println("Product Name: " + p.productName);
            System.out.println("Original Price: " + p.price);
            System.out.println("Discounted Price: " + p.getDiscountedPrice());
            System.out.println("Quantity: " + p.quantity);
            System.out.println("Discount: " + Product.discount + "%");
        } else {
            System.out.println("Invalid product details");
        }

        in.close();
    }
}
