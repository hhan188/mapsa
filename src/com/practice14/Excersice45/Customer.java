package com.practice14.Excersice45;

import java.util.ArrayList;

public class Customer
{
    private String name;
    private ArrayList <Double> transactions = new ArrayList<>();

    public Customer(String name, Double transaction)
    {
        this.name = name;
        this.transactions.add(transaction);
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Double> getTransactions()
    {
        return transactions;
    }

    public void addTransaction(double transaction)
    {
        transactions.add(transaction);
    }

}
