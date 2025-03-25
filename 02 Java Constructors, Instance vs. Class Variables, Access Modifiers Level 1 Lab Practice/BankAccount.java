import java.util.*;

public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
		balance = balance + 100;
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public class SavingsAccount extends BankAccount {

        public SavingsAccount(int accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        public void displaySavingsAccountDetails() {
            super.displayAccountDetails();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();
        
        System.out.print("Enter Balance: ");
        double balance = scanner.nextDouble();

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, balance);
        bankAccount.displayAccountDetails();

        System.out.print("Enter new Balance for Savings Account: ");
        double newBalance = scanner.nextDouble();

        BankAccount.SavingsAccount savingsAccount = bankAccount.new SavingsAccount(accountNumber, accountHolder, newBalance);
        savingsAccount.displaySavingsAccountDetails();

        scanner.close();
    }
}
