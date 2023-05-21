package Practic8.src.SecondProject;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;
    private int currentAccountIndex;
    private String currentDate;

    public Bank() {
    }

    public Bank(ArrayList<Account> accounts, int currentAccountIndex, String currentDate) {
        this.accounts = accounts;
        this.currentAccountIndex = currentAccountIndex;
        this.currentDate = currentDate;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
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
    public void deposit(int accountNumber,double amount , String description){
        Account account = getAccount(accountNumber);
        if (account!=null&& amount>0){
            account.setBalance(account.getBalance()+amount);
            String date = LocalDateTime.now().toString();
            Transection transection=new Transection(date,"deposit",amount,"sell");
            ArrayList<Transection> transections = new ArrayList<>();
            transections.add(transection);
            account.setTransections(transections);
        }
    }
    public void withdraw(int accountNumber,double amount , String description){
        Account account = getAccount(accountNumber);
        if (account!=null && amount>0 && account.getBalance()>=amount){
            account.setBalance(account.getBalance()-amount);
            String date = LocalDateTime.now().toString();
            Transection transection = new Transection(date,"withdraw",amount,"buy");
            ArrayList<Transection> transections = new ArrayList<>();
            transections.add(transection);
            account.setTransections(transections);
              }
        }

    public Account getAccount(int accountNumber){
        ArrayList <Account> accounts1 = accounts;
//        if (accounts.contains(accountNumber))
//        {
//            account1 = accounts.get(accountNumber);
//            return account1;
//        }
        for (Account accountt:accounts1) {
            if (accountt.getAccountNumber()==accountNumber){
                return accountt;
            }
        }
        return null;
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
