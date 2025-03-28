interface Discountable {
    double applyDiscount();
    void getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Item: ₹" + price);
        System.out.println("Quantity: " + quantity);
    }
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("10% discount applied for Veg Items.");
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        double nonVegCharge = 20.0;
        return baseTotal + nonVegCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("5% discount applied for Non-Veg Items.");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Tikka", 150.0, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 200.0, 1);

        FoodItem[] order = {veg, nonVeg};

        for (FoodItem item : order) {
            item.getItemDetails();
            System.out.println("Total Price (before discount): ₹" + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                d.getDiscountDetails();
                System.out.println("Discount Amount: ₹" + d.applyDiscount());
                System.out.println("Final Price after Discount: ₹" + (item.calculateTotalPrice() - d.applyDiscount()));
            }

            System.out.println();
        }
    }
}
