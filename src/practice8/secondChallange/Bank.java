package practice8.secondChallange;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts=new ArrayList<>();
    private int currentAccountIndex;
    private String currentDate;

    public Bank(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public Bank() {

    }


    public Bank(int currentAccountIndex, String currentDate,ArrayList<Account> accounts) {
        this.currentAccountIndex = currentAccountIndex;
        this.currentDate = currentDate;
        this.accounts=accounts;
    }

    public void deposit(int accountNumber, double amount, String description) {
            for (Account account : accounts) {
                if (account.getAccountNumber() == accountNumber) {
                    account.setBalance(account.getBalance() + amount);
                    Transaction newTransaction = new Transaction("12-12-12", "deposit", amount, "new deposit transaction added.");
                    account.getTransactions().add(newTransaction);
                    System.out.println(description);
                    break;
                } else {
                    continue;

            }
        }
    }


    public void withdraw(int accountNumber, double amount, String description) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                account.setBalance(account.getBalance() - amount);
                Transaction newTransaction = new Transaction("12-12-12", "withdraw", amount, "new withdraw transaction added.");
                account.getTransactions().add(newTransaction);
                System.out.println(description);
            }
        }

    }

    public Account getAccount(int accountNumber) {
        for (Account account:accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                ", currentAccountIndex=" + currentAccountIndex +
                ", currentDate='" + currentDate + '\'' +
                '}';
    }
}








