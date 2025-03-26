import java.util.*;

public class BankAccountSystem {
    static String bankName;
    static int totalCounts = 0;
    String accountHolderName;
    final int accountNumber;

    public BankAccountSystem(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalCounts++;
    }

    public static int getTotalaccounts() {
        return totalCounts;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the bank name: ");
        bankName = in.nextLine();
		System.out.println("Enter the accountHolderName: ");
        String accountHolderName = in.nextLine();
		System.out.println("Enter the account number: ");
        int accountNumber = in.nextInt();

        BankAccountSystem account = new BankAccountSystem(accountHolderName, accountNumber);
		
		System.out.println("The total object count is: "+ BankAccountSystem.getTotalaccounts());

        if (account instanceof BankAccountSystem) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
        } else {
            System.out.println("Invalid Bank account details");
        }

        in.close();
    }
}
