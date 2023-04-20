package tamrin6;

public class BankAccount {
    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber){
        setBalance(balance);
        setAccountNumber(accountNumber);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0)
            throw new IllegalArgumentException("Balance cannot be negative!!!");
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(int depositAmount){
        if(depositAmount < 0)
            return;
        balance += depositAmount;
        System.out.println("balance: " + balance);
    }

    public void withdraw(int withdrawAmount){
        if (balance < withdrawAmount)
            return;
        balance -= withdrawAmount;
        System.out.println("balance: " + balance);
    }
    public String compareBalances(BankAccount anotherBankAccount){
        if (balance == anotherBankAccount.getBalance())
            return "same balance";
        if (balance < anotherBankAccount.getBalance())
            return "smaller balance";
        return "grater balance";
    }
}
