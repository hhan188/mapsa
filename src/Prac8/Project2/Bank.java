package Prac8.Project2;

import java.util.HashMap;

public class Bank {
    private HashMap<Integer, Account> accounts;
    private int currentAccountIndex;
    private String currentDate;

    public Bank(HashMap<Integer, Account> accounts) {
        this.accounts = accounts;
        currentDate = "1";
    }

    public HashMap<Integer, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(HashMap<Integer, Account> accounts) {
        this.accounts = accounts;
    }

    public void deposit(int accountNumber, double amount, String description) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("account not found");
            return;
        }

        if (amount <= 0) {
            System.out.println("you cannot deposit less than zero");
            return;
        }

        Transaction transaction = new Transaction(currentDate, "deposit", amount, description);
        Account currentAccount = accounts.get(accountNumber);

        currentAccount.addTransaction(transaction);
        double newAccountBalance = currentAccount.getBalance() + amount;
        currentAccount.setBalance(newAccountBalance);
    }

    public void withdraw(int accountNumber, double amount, String description) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("account not found");
            return;
        }

        Account currentAccount = accounts.get(accountNumber);

        if (amount <= 0 || currentAccount.getBalance() < amount) {
            System.out.println("invalid amount or not enough amount");
            return;
        }

        Transaction transaction = new Transaction(currentDate, "withdraw", amount, description);
        currentAccount.addTransaction(transaction);

        double newAccountBalance = currentAccount.getBalance() - amount;
        currentAccount.setBalance(newAccountBalance);
    }

    public Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public void incrementCurrentDate() {
        int temp = Integer.parseInt(currentDate) + 1;
        currentDate = String.valueOf(temp);
    }
}
