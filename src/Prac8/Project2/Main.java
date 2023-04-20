package Prac8.Project2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Create accounts
        Account account1 = new Account(1, "sajjad", 100, new ArrayList<Transaction>());
        Account account2 = new Account(2, "abbas", 50, new ArrayList<Transaction>());
        HashMap<Integer, Account> accountsMap = new HashMap<Integer, Account>();
        accountsMap.put(account1.getAccountNumber(), account1);
        accountsMap.put(account2.getAccountNumber(), account2);

        //Create bank
        Bank bank = new Bank(accountsMap);

        //Transactions
        bank.deposit(1, 25, "add 25 to sajjad account");
        bank.withdraw(2, 10, "withdraw from abbas account");
        bank.withdraw(2, 100, "whitdraw from abbas account");

        //Change date
        bank.incrementCurrentDate();

        //Transactions
        bank.deposit(2, 0, "test for deposit");
        bank.withdraw(1, 10, "test for whitdraw");

        //Print all transactions and final balance for accounts
        bank.getAccounts().forEach(
                (accountNum, account) -> {
                    System.out.println();
                    System.out.println("showing information for account " + accountNum + " :");
                    System.out.println("holder name => " + account.getAccountHolderName());
                    System.out.println("transactions : ");
                    for (Transaction transaction : account.getTransactions()) {
                        System.out.println("date => " + transaction.getDate());
                        System.out.println("type => " + transaction.getType());
                        System.out.println("amount => " + transaction.getAmount());
                        System.out.println("description => " + transaction.getDescription());
                        System.out.println("***");
                    }
                    System.out.println("final balance => " + account.getBalance());
                }
        );
    }
}
