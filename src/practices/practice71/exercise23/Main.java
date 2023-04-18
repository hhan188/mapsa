package practices.practice71.exercise23;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BankAccount yaserAccount = new BankAccount(23500, "CA-123456");
        BankAccount aliAccount = new BankAccount(50000, "CA-111111");
        BankAccount rezaAccount = new BankAccount(42000, "CA-917151");
        BankAccount davidAccount = new BankAccount(100000, "CA-***12**9");
        BankAccount[] bankAccounts = {yaserAccount, aliAccount, rezaAccount, davidAccount};
        System.out.println(Arrays.toString(bankAccounts));
        System.out.println("*****************");
        System.out.println("total Amount Of Balances: " + new BankUtils().totalBalance(bankAccounts));

    }
}
