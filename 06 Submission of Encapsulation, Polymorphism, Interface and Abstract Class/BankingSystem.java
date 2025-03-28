interface Loanable {
 void applyForLoan();
 double calculateLoanEligibility();
}

abstract class BankAccount {
 private int accountNumber;
 private String holderName;
 private double balance;

 public BankAccount(int accountNumber, String holderName, double balance) {
  this.accountNumber = accountNumber;
  this.holderName = holderName;
  this.balance = balance;
 }

 public int getAccountNumber() {
  return accountNumber;
 }

 public void setAccountNumber(int accountNumber) {
  this.accountNumber = accountNumber;
 }

 public String getHolderName() {
  return holderName;
 }

 public void setHolderName(String holderName) {
  this.holderName = holderName;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance(double balance) {
  this.balance = balance;
 }

 public void deposit(double amount) {
  balance += amount;
 }

 public void withdraw(double amount) {
  if (balance >= amount) {
   balance -= amount;
  }
 }

 public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
 public SavingsAccount(int accountNumber, String holderName, double balance) {
  super(accountNumber, holderName, balance);
 }

 public double calculateInterest() {
  return getBalance() * 0.04;
 }

 public void applyForLoan() {
  System.out.println("Loan Applied: Savings Account");
 }

 public double calculateLoanEligibility() {
  return getBalance() * 5;
 }
}

class CurrentAccount extends BankAccount implements Loanable {
 public CurrentAccount(int accountNumber, String holderName, double balance) {
  super(accountNumber, holderName, balance);
 }

 public double calculateInterest() {
  return getBalance() * 0.02;
 }

 public void applyForLoan() {
  System.out.println("Loan Applied: Current Account");
 }

 public double calculateLoanEligibility() {
  return getBalance() * 3;
 }
}

public class BankingSystem {
 public static void main(String[] args) {
  BankAccount b1 = new SavingsAccount(101, "Alice", 50000);
  BankAccount b2 = new CurrentAccount(102, "John", 20000);

  BankAccount[] accounts = new BankAccount[2];
  accounts[0] = b1;
  accounts[1] = b2;

  for (int i = 0; i < accounts.length; i++) {
   double interest = accounts[i].calculateInterest();
   double loanEligible = 0;

   if (accounts[i] instanceof Loanable) {
    ((Loanable) accounts[i]).applyForLoan();
    loanEligible = ((Loanable) accounts[i]).calculateLoanEligibility();
   }

   System.out.println("Account Number: " + accounts[i].getAccountNumber());
   System.out.println("Holder Name: " + accounts[i].getHolderName());
   System.out.println("Balance: " + accounts[i].getBalance());
   System.out.println("Interest Earned: " + interest);
   System.out.println("Loan Eligible Amount: " + loanEligible);
   System.out.println();
  }
 }
}
