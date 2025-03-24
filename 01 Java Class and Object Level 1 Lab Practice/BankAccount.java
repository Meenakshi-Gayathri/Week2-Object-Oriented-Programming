import java.util.*;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int number, double initialBalance) {
        accountHolder = holder;
        accountNumber = number;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful! Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful! Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Account Holder Name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter Account Number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = input.nextDouble();

        BankAccount account = new BankAccount(accountHolder, accountNumber, balance);

        System.out.print("Enter amount to Deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter amount to Withdraw: ");
        double withdrawAmount = input.nextDouble();
        account.withdraw(withdrawAmount);

        account.displayBalance();
    }
}
