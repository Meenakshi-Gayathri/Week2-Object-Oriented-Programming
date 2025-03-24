import java.util.*;

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String phoneBrand, String phoneModel, double phonePrice) {
        brand = phoneBrand;
        model = phoneModel;
        price = phonePrice;
    }

    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Mobile Phone Brand: ");
        String phoneBrand = input.nextLine();

        System.out.print("Enter Mobile Phone Model: ");
        String phoneModel = input.nextLine();

        System.out.print("Enter Price of the Mobile Phone: ");
        double phonePrice = input.nextDouble();

        MobilePhone phone = new MobilePhone(phoneBrand, phoneModel, phonePrice);
        phone.displayDetails();
    }
}
