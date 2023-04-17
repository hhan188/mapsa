package Prac7;

/**
 * practice about using object as arguments of methods or return type of methods - Soale 6
 * Create a class called BankAccount with properties for balance and account number.
 * Write a method that takes in an array of BankAccount objects and returns the total balance of all the accounts in the array.
 */
public class BankAccount {
    private double balance;
    private long accountNumber;

    BankAccount(double balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public static double calcTotalBalance(BankAccount[] accounts) {
        double sum = 0;
        for (BankAccount account : accounts)
            sum += account.getBalance();

        return sum;
    }
}
