package SoheylSayyah.Practice14.Exercise18;

import java.util.ArrayList;

public class Customer
{
    private String name;
    ArrayList<Double> transactions = new ArrayList<>();
    public Customer(String name,double transaction)
    {
        this.name = name;
        transactions.add(transaction);
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<Double> getTransactions()
    {
        return transactions;
    }
    public void addTransaction(double transaction){
        transactions.add(transaction);
    }
}
