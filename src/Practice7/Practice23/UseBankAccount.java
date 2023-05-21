package Practice7.Practice23;

public class UseBankAccount {
    public static void main(String[] args) {
        BankAccount[] bankAccounts=new BankAccount[3];
        bankAccounts[0]=new BankAccount(2000,"23d12s");
        bankAccounts[1]=new BankAccount(3092,"3re3w");
        bankAccounts[2]=new BankAccount(4345,"4565fec");
        System.out.println(totalBalance(bankAccounts));

    }
    public static int totalBalance(BankAccount[] bankAccounts){
        int sum=0;
        for (BankAccount item:bankAccounts) {
            sum+= item.getBalance();
        }
        return sum;
    }
}
