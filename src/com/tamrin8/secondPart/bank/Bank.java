package com.tamrin8.secondPart.bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bank {
    private Account[] accounts = new Account[100];
    private int currentAccountIndex = 0;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    private String currentDate = formatter.format(now);

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getCurrentAccountIndex() {
        return currentAccountIndex;
    }

    public void setCurrentAccountIndex(int currentAccountIndex) {
        this.currentAccountIndex = currentAccountIndex;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public Bank(Account[] accounts, int currentAccountIndex, String currentDate) {
        this.accounts = accounts;
        this.currentAccountIndex = currentAccountIndex;
        this.currentDate = currentDate;
    }

    public Bank() {

    }

    private Transaction transaction;

    public boolean addAccount(Account account) {
        if (currentAccountIndex == accounts.length) {
            return false;
        }
        account.setTransactions(new Transaction(currentDate, "Create Account", account.getBalance(), "Created Account For " + account.getAccountHolderName()));
        accounts[currentAccountIndex] = account;
        currentAccountIndex++;
        return true;
    }

    public Account getAccount(int accountNumber) {
        for (int i = 0; accounts[i] != null; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    public boolean deposit(int accountNumber, double amount, String description) {
        Account temp = getAccount(accountNumber);
        if (temp == null)
        {
            return false;
        }
        if (amount > 0)
        {
            temp.setBalance(temp.getBalance() + amount);
            transaction = new Transaction(currentDate, "Deposit", amount, description);
            temp.setTransactions(transaction);

            return true;
        }
        return false;
    }

    public boolean withdraw(int accountNumber, double amount, String description)
    {
        Account temp = getAccount(accountNumber);
        if (temp == null)
        {
            return false;
        }
            if (amount > 0)
            {
                temp.setBalance(temp.getBalance() - amount);
                transaction = new Transaction(currentDate, "Withdraw", amount, description);
                temp.setTransactions(transaction);

                return true;
            }
            return false;
        }

        public void incrementCurrentDate ()
        {
            now = LocalDateTime.now().plusDays(1);
            currentDate = formatter.format(now);
        }
    }
