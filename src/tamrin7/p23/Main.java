package tamrin7.p23;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {

        BankAccount[] bankAccounts = new BankAccount[3];
        bankAccounts[0] = new BankAccount("0063236303", 17000);
        bankAccounts[1] = new BankAccount("0076059091", 35000);
        bankAccounts[2] = new BankAccount("0152533191", 1000);

        double totalBalance = totalBalance(bankAccounts);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyStr = currency.format(totalBalance);
        System.out.println("Total balance is: " + currencyStr);

    }

    private static double totalBalance(BankAccount[] bankAccounts) {

        double totalBalance = 0;
        for (BankAccount b :
                bankAccounts) {
            totalBalance += b.getBalance();
        }
        return totalBalance;
    }
}
