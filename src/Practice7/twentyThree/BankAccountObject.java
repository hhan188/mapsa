package Practice7.twentyThree;

import java.util.Arrays;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = {new BankAccount(1000), new BankAccount(2000), new BankAccount(3000), new BankAccount(4000)};
        System.out.println(totalBalance(bankAccounts));

    }

    public static String totalBalance(BankAccount[] bankAccounts) {
        double[] accountBalances = new double[4];
        for (int i = 0; i < 4; i++)
            accountBalances[i] = bankAccounts[i].getBalance();
        return Arrays.toString(accountBalances);
    }
}
