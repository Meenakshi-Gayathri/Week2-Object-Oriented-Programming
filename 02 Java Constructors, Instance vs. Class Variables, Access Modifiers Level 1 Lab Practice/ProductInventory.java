import java.util.*;

public class ProductInventory {
    String productName;
    double price;

    static int totalProducts = 0;

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("The name: " + productName);
        System.out.println("The price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            ProductInventory product = new ProductInventory(productName, price);
            product.displayProductDetails();

            System.out.print("Do you want to add another product? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

        displayTotalProducts();
        scanner.close();
    }
}