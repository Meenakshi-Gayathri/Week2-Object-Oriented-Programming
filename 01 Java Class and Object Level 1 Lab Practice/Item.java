import java.util.*;

public class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double cost) {
        itemCode = code;
        itemName = name;
        price = cost;
    }

    void displayDetails() {
        System.out.println("Item Details:");
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        int code = input.nextInt(); 

        input.nextLine();        

        System.out.print("Enter Item Name: ");
        String name = input.nextLine();

        System.out.print("Enter Price of the Item: ");
        double cost = input.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = input.nextInt();

        Item item = new Item(code, name, cost);
        item.displayDetails();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " items: " + totalCost);
    }
}
