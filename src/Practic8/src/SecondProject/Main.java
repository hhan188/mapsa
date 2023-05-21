package Practic8.src.SecondProject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transection> transections = new ArrayList<>();
        Account account1 = new Account(123,"Ehsan",5000,transections );
        Account account2 = new Account(1234,"Soheyl",7000, transections);
        Account account3 = new Account(12345, "Ali",8000, transections);
        Transection transection1 = new Transection("2022/02/01","deposit",2000,"sell");
            ArrayList<Account> accounts = new ArrayList<>();

            accounts.add(account1);
            accounts.add(account2);
            accounts.add(account3);
            Bank bank = new Bank(accounts,1,"2022/02/01");
        //bank.getAccount(123);
            bank.deposit(123,2000,"sell");
        System.out.println(bank.getAccount(123));

    }
}
