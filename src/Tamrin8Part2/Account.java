package Tamrin8Part2;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Account {

    //The Account class should have the following instance variables:
    // accountNumber (an int), accountHolderName (a String),
    // balance (a double), and transactions (an array of Transaction objects). It should also have >

    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private ArrayList<Transaction> transactions;

    public Account(int accountNumber, String accountHolderName, double balance, ArrayList<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.transactions = transactions;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
