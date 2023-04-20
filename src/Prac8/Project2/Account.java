package Prac8.Project2;

import java.util.ArrayList;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(int accountNumber, String accountHolderName, double balance, ArrayList<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = transactions;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }
}
