package practice8.secondChallange;

import practice8.secondChallange.Account;
import practice8.secondChallange.Bank;
import practice8.secondChallange.Transaction;

import java.util.ArrayList;

public class UsingBankAccount {
    public static void main(String[] args){


        ArrayList<Account> accounts=new ArrayList<>();

        Account firstAccount=new Account(12,"Sadeghi",12_000);
        Account secondAccount=new Account(13,"Rezayi",89_000);
        Account thirdAccount=new Account(14,"Molayi",43_000);
        accounts.add(firstAccount);
        accounts.add(secondAccount);
        accounts.add(thirdAccount);

        Bank bank=new Bank(12,"23",accounts);


        bank.deposit(13, 1_000, "deposit transaction was made.");
        System.out.println(secondAccount.getBalance());
        System.out.println("----------------------------");


        bank.withdraw(14,1_000,"withdraw transaction was made.");
        System.out.println(thirdAccount.getBalance());
        System.out.println("------------------------------");

        System.out.println(bank.getAccount(12));

        System.out.println(secondAccount.getTransactions());


    }
}
