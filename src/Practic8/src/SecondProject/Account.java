package Practic8.src.SecondProject;

import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<Transection> transections;

    public Account() {
    }

    public Account(int accountNumber, String accountHolderName, double balance, ArrayList<Transection> transections) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transections = transections;
    }

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

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transection> getTransections() {
        return transections;
    }

    public void setTransections(ArrayList<Transection> transections) {
        this.transections = transections;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                ", transections=" + transections +
                '}';
    }
}
