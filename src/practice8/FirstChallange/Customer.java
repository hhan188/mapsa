package practice8.FirstChallange;

import practice8.FirstChallange.Item;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double balance;
    private ArrayList <Item> itemPurchased=new ArrayList<>();//yeki az field hash ye arraylist az abject haye class iteme

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", itemPurchased=" + itemPurchased.toString() +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


    public ArrayList<Item> getItemsPurchased() {
        return itemPurchased;
    }

    public void setItemsPurchased(ArrayList<Item> items) {
        this.itemPurchased=itemPurchased;
    }


    public Customer(String name, double balance){
        this.name=name;
        this.balance=balance;

    }

}
