package Tamrin8Part2;

import sun.util.resources.LocaleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws ParseException {
        Account acc = new Account(123, "sepehr", 1200, new ArrayList<>());
        Account ac = new Account(122, "Hanieh", 1300, new ArrayList<>());
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        String date = String.valueOf(new Date()) ;
        LocalDateTime date =

        Bank bank = new Bank(new ArrayList<>(), 1, date);
        bank.incrementCurrentDate();
        ArrayList<Account> accounts =bank.getAccount();
        accounts.add(acc);
        accounts.add(ac);
        bank.setAccount(accounts);
        bank.deposit(123, 500, "hoghugh");
        bank.deposit(13, 500, "hoghugh");
        bank.withdraw(123, 1200, "ejare");

        System.out.println(bank.getAccount(123));
    }
}
