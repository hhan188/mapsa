package SoheylSayyah.Practice7.Exercise23;

public class UsingBankAccount {
    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[3];
        bankAccounts[0] = new BankAccount("247",5000);
        bankAccounts[1] = new BankAccount("248",4000);
        bankAccounts[2] = new BankAccount("249",3000);
        System.out.println("Total Balance is : " + totalBalance(bankAccounts));
    }
    public static int totalBalance(BankAccount[] bankAccounts){
        int total = 0;
        for (BankAccount bankAccount : bankAccounts){
            total += bankAccount.getBalance();
        }
        return total;
    }
}
