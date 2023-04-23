package SoheylSayyah.Practice8.FirstProject;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private ArrayList<Item> itemsPurchased;

    public Customer(String name, double balance, ArrayList<Item> itemsPurchased) {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = itemsPurchased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Item> getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(ArrayList<Item> itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }
    public void addCustomer(Customer customer){
        customer.addCustomer(customer);
    }
}
