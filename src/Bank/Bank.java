package Bank;

import java.time.LocalDateTime;
import java.util.List;

public class Bank {
    private List<Account> accounts;
    private int currentAccountIndex;
    private String currentDate;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
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

    public Bank(List<Account> accounts, int currentAccountIndex) {
        this.accounts = accounts;
        this.currentAccountIndex = currentAccountIndex;
        incrementCurrentDate();
    }



    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                ", currentAccountIndex=" + currentAccountIndex +
                ", currentDate='" + currentDate + '\'' +
                '}';
    }
    public void deposit(int accountNumber,double amount,String description){
        if(amount>0){
            for (Account account:accounts){
                if(account.getAccountNumber()==accountNumber){
                    account.setBalance(account.getBalance()+amount);
                    Transaction tr=new Transaction(currentDate,"deposit",amount,description);
                    account.getTransactions().add(tr);
                    break;
                }else System.out.println("account dose not exist");
            }
        }else System.out.println("enter a valid amount...");
    }
    public void withdraw(int accountNumber,double amount,String description){
        if(amount>0){
            for(Account acc:accounts){
                if(acc.getAccountNumber()==accountNumber){
                    acc.setBalance(acc.getBalance()-amount);
                    Transaction tr=new Transaction(currentDate,"withdraw",amount,description);
                    acc.getTransactions().add(tr);
                    break;
                }else System.out.println("account doesn't exist");
            }
        }else System.out.println("enter a valid amount...");

    }
    public void incrementCurrentDate(){
        currentDate=LocalDateTime.now().toString();
    }
    public Account getAccount(int accountNumber){
        Account acc=null;
        for(Account a:accounts){
            if(a.getAccountNumber()==accountNumber){
                acc=a;
                break;
            }else System.out.println("account not found");
        }
        return acc;
    }


}
