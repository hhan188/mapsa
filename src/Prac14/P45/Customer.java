package Prac14.P45;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        transactions.add(initTransaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTranscations() {
        return transactions;
    }

    public void addTranscation(double transaction) {
        transactions.add(transaction);
    }
}
