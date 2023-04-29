package Tamrin8;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Item> itemsInStock = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        Item item1 = new Item("iphone13", 12.8, 20);
        Item item2 = new Item("iphone14", 19.8, 10);
        Store store = new Store("DigiKala", itemsInStock, customers);
        store.addItem(item1);
        store.addItem(item2);
        ArrayList<Item> itemsPurchased = new ArrayList<>();
        itemsPurchased.add(item1);
        ArrayList<Item> itemsPurchased2 = new ArrayList<>();
        itemsPurchased2.add(item2);
        Customer customer1 = new Customer("hanieh", 500, itemsPurchased);
        Customer customer2 = new Customer("hedieh", 200, itemsPurchased2);
        store.addCustomer(customer1);
        store.addCustomer(customer2);
        store.sellItem(customer1, item2);
        store.sellItem(customer1, item1);
        System.out.println(store.toString());
        //print out the final balances and items purchased for each customer

    }
}
