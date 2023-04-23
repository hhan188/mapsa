package Practice8.Two;

public class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    Transaction[] transactions;

    public Account(int accountNumber, String accountHolderName, double balance, Transaction[] transactions) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = transactions;
    }
}
