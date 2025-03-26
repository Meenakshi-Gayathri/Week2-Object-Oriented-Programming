import java.util.ArrayList;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    int orderId;
    ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + "\n Price: " + product.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
}

class Customer {
    String name;
    ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayCustomerOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
            System.out.println("Total Price: " + order.calculateTotal());
            System.out.println("\n");
        }
    }
}

public class ECommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.00);
        Product p2 = new Product("Headphones", 100.00);
        Product p3 = new Product("Phone", 600.00);

        Order order1 = new Order(1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Customer customer = new Customer("John Doe");

        customer.placeOrder(order1);

        Order order2 = new Order(2);
        order2.addProduct(p2);
        order2.addProduct(p3);

        customer.placeOrder(order2);

        customer.displayCustomerOrders();
    }
}
