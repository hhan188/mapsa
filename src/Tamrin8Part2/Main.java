package Tamrin8Part2;

import sun.util.resources.LocaleData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args)  {
        Account acc = new Account(123, "sepehr", 1200, new ArrayList<>());
        Account ac = new Account(122, "Hanieh", 1300, new ArrayList<>());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String date = formatter.format(now);
        Bank bank = new Bank(new ArrayList<>(), 1, date);
        bank.incrementCurrentDate();
        ArrayList<Account> accounts = bank.getAccount();
        accounts.add(acc);//2023-04-30 20:23:38
        accounts.add(ac);
        bank.setAccount(accounts);
        bank.deposit(123, 500, "hoghugh");
        bank.deposit(13, 500, "hoghugh");
        bank.withdraw(123, 1200, "ejare");

        System.out.println(bank.getAccount(123));
    }
}
