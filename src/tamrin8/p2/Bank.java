package tamrin8.p2;

import java.time.LocalDate;

public class Bank {
    //Fields
    private Account[] accounts;
    private int currentAccountIndex;
    private String currentDate;

    //Constructor
    public Bank(Account[] accounts) {

        setAccounts(accounts);

    }

    //Getters & Setters
    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
        updateCurrentAccountIndex();
    }

    public int getCurrentAccountIndex() {
        updateCurrentAccountIndex();
        return currentAccountIndex;
    }

    public void setCurrentAccountIndex(int currentAccountIndex) {
        this.currentAccountIndex = currentAccountIndex;
    }

    private void updateCurrentAccountIndex() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                setCurrentAccountIndex(i);
                break;
            }
        }
    }

    public String getCurrentDate() {
        updateCurrentDate();
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public void updateCurrentDate() {
        setCurrentDate(String.valueOf(LocalDate.now()));
    }


    //Methods

    public boolean deposit(int accountNumber, double amount, String description) {

        int accountIndex = accountExistence(accountNumber);
        if (accountIndex == -1) {
            System.out.println("Account with account number " + accountNumber + " does not exists!");
            return false;
        }
        if (!amountChecker(amount)) {
            System.out.println("The amount of money must be greater than zero!");
            return false;
        }

        Account currentOperationAcc = getAccount(accountNumber);

        {//Atomic transaction simulation
            Transaction depositTransaction = new Transaction(this.getCurrentDate(), "deposit", amount,
                    "D, ACC:" + accountNumber + " Owner: " + currentOperationAcc.getAccountHolderName()
                    + " Balance Before: " + currentOperationAcc.formattedBalance());
            boolean result = setAccountTransaction(currentOperationAcc, depositTransaction);
            if (result) {
                currentOperationAcc.setBalance(currentOperationAcc.getBalance() + amount);
                accounts[accountIndex] = currentOperationAcc;
                System.out.println("Deposit Transaction Committed Successfully");
                return true;
            }
        }
        return false;
    }

    public boolean withdraw(int accountNumber, double amount, String description) {

        int accountIndex = accountExistence(accountNumber);
        if (accountIndex == -1) {
            System.out.println("Account with account number " + accountNumber + " does not exists!");
            return false;
        }
        if (!amountChecker(amount)) {
            System.out.println("The amount of money must be greater than zero!");
            return false;
        }

        if (amount > accounts[accountIndex].getBalance()) {
            System.out.println("The current account balance is not enough for this withdrawal!");
            return false;
        }

        Account currentOperationAcc = getAccount(accountNumber);

        {//Atomic transaction simulation
            Transaction withdrawTransaction = new Transaction(this.getCurrentDate(), "withdraw", amount,
                    "W, ACC:" + accountNumber + " Owner:'" + currentOperationAcc.getAccountHolderName()
                            + "' Balance Before: " + currentOperationAcc.formattedBalance());
            boolean result = setAccountTransaction(currentOperationAcc, withdrawTransaction);
            if (result) {
                currentOperationAcc.setBalance(currentOperationAcc.getBalance() - amount);
                accounts[accountIndex] = currentOperationAcc;
                System.out.println("Withdraw Transaction Committed Successfully");
                return true;
            }
        }
        return false;
    }

    private boolean setAccountTransaction(Account account, Transaction transaction) {

        Transaction[] accountTransactions = account.getTransactions();

        for (int i = 0; i < accountTransactions.length; i++) {
            if (accountTransactions[i] == null) {
                accountTransactions[i] = transaction;
                account.setTransactions(accountTransactions);
                return true;
            }
        }
        System.out.println("Account " + account.getAccountNumber() + " transactions are full!");
        return false;
    }

    public int accountExistence(int accountNumber) {

        for (int i = 0; i < getCurrentAccountIndex(); i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                //return account index
                return i;
            }
        }
        //account with this account number does not exist
        return -1;
    }

    public boolean amountChecker(double amount) {
        return amount > 0;
    }

    public Account getAccount(int accountNumber) {

        for (int i = 0; i < getCurrentAccountIndex(); i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                //return account index
                return accounts[i];
            }
        }
        //account with this account number does not exist
        return null;
    }

    public void addAccount(Account newAccount){
        this.accounts[getCurrentAccountIndex()] = newAccount;
        updateCurrentAccountIndex();
    }

}
