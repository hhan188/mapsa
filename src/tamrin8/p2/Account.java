package tamrin8.p2;

import java.text.NumberFormat;
import java.util.Arrays;

public class Account {
    //Fields
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private Transaction[] transactions;

    //Constructor
    public Account(int accountNumber, String accountHolderName, double balance, Transaction[] transactions) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = transactions;
    }

    //Getters & Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String formattedBalance(){
        NumberFormat n = NumberFormat.getNumberInstance();
        return  n.format(balance);
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction[] transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "\nAccount{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + formattedBalance() +
                ", transactions=" + Arrays.toString(transactions) +
                '}'+ "\n - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -";
    }
}
