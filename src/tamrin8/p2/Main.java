package tamrin8.p2;

public class Main {
    public static void main(String[] args) {

        //create a Bank object and add some accounts to it
        Bank myBank = new Bank(new Account[10]);

        Account ehsan = new Account
                (1001, "Ehsan Babaei", 100000, new Transaction[10]);
        myBank.addAccount(ehsan);

        Account masoomeh = new Account
                (1002, "Masoomeh Sadat Nazeri", 200000, new Transaction[10]);
        myBank.addAccount(masoomeh);

        System.out.println("\nPrint customers account details:");
        System.out.println(ehsan);
        System.out.println(masoomeh);


        System.out.println("\nPrint transaction logs:\n");
        boolean transactionResult;

        transactionResult = myBank.deposit(1001, 5000000,"Variz be ehsan 1");
        System.out.println(transactionResult ? "Transaction Done" : "Transaction Failed!");

        transactionResult = myBank.deposit(1002, 20000000,"Variz be masoomeh 1");
        System.out.println(transactionResult ? "Transaction Done" : "Transaction Failed!");

        transactionResult = myBank.withdraw(1001, 500000,"Bardasht az ehsan 1");
        System.out.println(transactionResult ? "Transaction Done" : "Transaction Failed!");

        transactionResult = myBank.withdraw(1002, 2000000,"Bardasht az masoomeh 1");
        System.out.println(transactionResult ? "Transaction Done" : "Transaction Failed!");


        System.out.println("\nPrint customers account details:");
        System.out.println(ehsan);
        System.out.println(masoomeh);



    }
}
