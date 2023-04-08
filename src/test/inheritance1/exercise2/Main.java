package test.inheritance1.exercise2;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(123456);
        account.setBalance(25000);
        account.setInterestRate(2);
        System.out.println("before deposit: " + account.getBalance());
        account.deposit(200);
        System.out.println("after deposit: " + account.getBalance());
        account.withdraw(600);
        System.out.println("after withdraw: " + account.getBalance());
        //*********************************************************
        //test for exception
        account.withdraw(80000);
        System.out.println("after withdraw: " + account.getBalance());

    }
}
