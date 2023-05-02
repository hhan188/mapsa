package Practice8_2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts=new ArrayList<>();
        ArrayList<Transaction> transactions=new ArrayList<>();

        Account account1=new Account(123,"ali",5000,transactions);

        Transaction transaction=new Transaction("2022,02,22","jari",100.0,"sell");

        Bank bank=new Bank(accounts,1,"a");

        accounts.add(account1);

        bank.deposit(123,2,"sell");

        System.out.println(bank.getAccount(123));





    }
}
