package com.tamrin8.secondPart.bank;

public class Account
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private Transaction [] transactions = new Transaction[50];

    private int trnsCounter = 0;

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

    public Transaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(Transaction transaction) {
        if (trnsCounter < transactions.length)
        {
            this.transactions[trnsCounter] = transaction;
            trnsCounter++;
        }
        else
        {
            System.out.println("Your Items Is Full");
        }
    }

    public void setTransactions() {
        trnsCounter = 0;
    }

    public Account (int accountNumber, String accountHolderName, double balance, Transaction[] transactions) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = transactions;
    }

    public Account (int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public Account ()
    {

    }
}
