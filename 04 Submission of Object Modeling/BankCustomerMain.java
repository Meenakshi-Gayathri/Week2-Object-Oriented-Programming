import java.util.ArrayList;

class Customer {
    String customerName;
    int id;
    ArrayList<Double> balances; //each balance one account 
    Bank bank; //ref to linked bank 

    public Customer(String customerName, int id, Bank bank) {
        this.customerName = customerName;
        this.id = id;
        this.bank = bank;
        this.balances = new ArrayList<>();
    }

    void viewBalance() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("ID: " + id);
        System.out.println("Bank: " + bank.name);
        for (int i = 0; i < balances.size(); i++) {
            System.out.println("Account " + (i + 1) + " Balance: " + balances.get(i));
        }
        System.out.println("\n");
    }
}

class Bank {
    String name;
    String branch;
    int ifsccode;
    ArrayList<Customer> customers; //a bank can have many customers(list of customers)

    public Bank(String name, String branch, int ifsccode) {
        this.name = name;
        this.branch = branch;
        this.ifsccode = ifsccode;
        this.customers = new ArrayList<>();
    }

    void openAccount(Customer customer, double initialDeposit) {
        customer.balances.add(initialDeposit);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Opened account for " + customer.customerName + " with balance ₹" + initialDeposit);
    }
}

public class BankCustomerMain {
    public static void main(String[] args) {
        Bank bank = new Bank("Green Bank", "Main Branch", 123456);

        Customer c1 = new Customer("Aisha", 101, bank);
        Customer c2 = new Customer("Ravi", 102, bank);

        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 3000);
        bank.openAccount(c2, 8000);

        System.out.println("\n--- Customer Balances ---");
        c1.viewBalance();
        c2.viewBalance();
    }
}
