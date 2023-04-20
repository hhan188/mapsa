package Prac8.Project1;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private ArrayList<Item> itemsPurchased;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = new ArrayList<Item>();
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

    public void addPurchasedItem(Item item) {
        itemsPurchased.add(item);
    }

    public void reduceBalance(double price) {
        balance -= price;
    }
}
