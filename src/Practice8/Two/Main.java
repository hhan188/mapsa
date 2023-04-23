package Practice8.Two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Transaction[] transactions = new Transaction[10];
        Account[] accounts = new Account[1];
        accounts[0] = new Account(123, "mmd", 100, transactions);
        Bank bank = new Bank(accounts);
        bank.deposit(123, 100,"first deposit");
        bank.withdraw(1321, 100, "first withdraw");
        System.out.println(accounts[0].transactions[0].type);

    }
}
