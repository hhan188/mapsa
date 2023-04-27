package Tamrin6;

public class BankAccount {
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int deposit(int amount) {
        return this.balance + amount;
    }

    public int withdraw(int amount) {
        return amount - this.balance;
    }

    public String compareTo(BankAccount o) {
    Integer.compare(o.balance,this.balance);
        if (this.balance == o.balance) {
            return "e";

        } else if (this.balance > o.balance) {
            return "greater";
        } else return "smaller";
    }

}
