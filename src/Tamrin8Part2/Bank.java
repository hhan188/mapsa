package Tamrin8Part2;

import lombok.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

@Data
public class Bank {
    //The Bank class should have the following instance variables: accounts (an array of Account objects),
    // currentAccountIndex (an int), and currentDate (a String).
    // It should also have a constructor that takes in values for the array of accounts.

    private ArrayList<Account> account;
    private int currentAccountIndex;
    private String currentDate;

    public Bank(ArrayList<Account> account, int currentAccountIndex, String currentDate) {
        this.account = account;
        this.currentAccountIndex = currentAccountIndex;
        this.currentDate = currentDate;
    }
//deposit(int accountNumber, double amount, String description):
// Allows a user to deposit money into their account. This method should first check if the account exists and
// if the amount being deposited is greater than zero.
// If both of these conditions are true, the amount should be added to the account's balance
// and a new Transaction object should be created and added to the account's list of transactions.

    public void deposit(int accountNumber, double amount, String description) {
        Account customerAccount = getAccount(accountNumber);
        if (customerAccount != null && amount > 0) {
            customerAccount.setBalance(customerAccount.getBalance() + amount);
            String date = String.valueOf(new Date());
            Transaction tr = new Transaction(date, "deposit", amount, description);
            ArrayList<Transaction> transactions = customerAccount.getTransactions();
            transactions.add(tr);
            customerAccount.setTransactions(transactions);
        }
    }

    //withdraw(int accountNumber, double amount, String description): Allows a user to withdraw money from their account. .
// This method should first check if the account exists, if the amount being withdrawn is greater than zero,
// and if the account has enough money to cover the withdrawal. If all of these conditions are true,
// the amount should be subtracted from the account's balance and a new Transaction object should be created and added to the account's
// list of transactions.
    public void withdraw(int accountNumber, double amount, String description) throws ParseException {
        Account customerAccount = getAccount(accountNumber);
        if (customerAccount != null && amount > 0 && customerAccount.getBalance()>=amount) {
            customerAccount.setBalance(customerAccount.getBalance() - amount);
            String date = String.valueOf(new Date());
            Transaction tr = new Transaction(currentDate, "withdraw", amount, description);
            ArrayList<Transaction> transactions = customerAccount.getTransactions();
            transactions.add(tr);
            customerAccount.setTransactions(transactions);
        }
    }


//getAccount(int accountNumber): Returns the Account object with the specified account number.
// If no such account exists, this method should return null.


    public Account getAccount(int accountNumber) {
     /*   Account a = new Account(accountNumber);
        int index = this.account.indexOf(a.getAccountNumber());
        if (index != -1) {
            return this.account.get(index);
        }*/
        for(Account existAccount : account){
            if(existAccount.getAccountNumber()==accountNumber){
                return existAccount;
            }
        }
        return null;

    }
//incrementCurrentDate(): Advances the current date by one day.
// This method should be called once per day to update the dates of transactions.
    public void incrementCurrentDate() throws ParseException {
       // currentDate = "2023-04-18 16:23:28";
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH).parse(this.currentDate);
        LocalDateTime.from(date.toInstant()).plusDays(1);
        currentDate=String.valueOf(date);
    }
}
