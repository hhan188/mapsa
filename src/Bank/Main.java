package Bank;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account acc=new Account(123,"babak",1500, new ArrayList<>());
        Bank bank= new Bank(new ArrayList<>(),1);
        bank.getAccounts().add(acc);
        bank.deposit(123,200,"houghogh");
        System.out.println(bank.getAccount(123));



    }
}
