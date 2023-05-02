package Practice8_2;

import java.util.ArrayList;
import java.util.Date;

public class Bank {
    private ArrayList<Account> account;
    private int currentAccountIndex;
    private String currentDate;

    public Bank() {
    }

    public Bank(ArrayList<Account> account, int currentAccountIndex, String s) {
        this.account = account;
        this.currentAccountIndex = currentAccountIndex;
        this.currentDate = currentDate;
    }

    public ArrayList<Account> getAccount() {
        return account;
    }

    public void setAccount(ArrayList<Account> account) {
        this.account = account;
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
    public void deposit(int accountNumber, double amount, String description){
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

    public void withdraw(int accountNumber, double amount, String description){
        Account customerAccount=getAccount(accountNumber);
        if (customerAccount !=null&& amount>0){
            customerAccount.setBalance(customerAccount.getBalance()+amount);
            String date=String.valueOf(new Date());
            Transaction tr=new Transaction(date,"deposit",amount,description);
            ArrayList<Transaction> transactions = customerAccount.getTransactions();
            transactions.add(tr);
            customerAccount.setTransactions(transactions);
        }
    }
    public Account getAccount(int accountNumber){
        for(Account existAccount : account){
            if(existAccount.getAccountNumber()==accountNumber){
                return existAccount;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "account=" + account +
                ", currentAccountIndex=" + currentAccountIndex +
                ", currentDate='" + currentDate + '\'' +
                '}';
    }
}
