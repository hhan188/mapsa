package test.inheritance1.exercise2;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private int interestRate;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        if (withdraw > this.balance) {
            throw new IllegalArgumentException();
        } this.balance -= withdraw;
    }
}
