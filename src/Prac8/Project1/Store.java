package Prac8.Project1;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Item> itemsInStock;
    private ArrayList<Customer> customers;

    public Store(String name) {
        this.name = name;
        this.itemsInStock = new ArrayList<Item>();
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(ArrayList<Item> itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addItem(Item item) {
        itemsInStock.add(item);
    }

    public void sellItem(Customer customer, Item item) {
        if (item.getQuantity() < 0 || !itemsInStock.contains(item)) {
            System.out.println("item out of stock");
            return;
        }

        if (customer.getBalance() < item.getPrice()) {
            System.out.println("insufficient balance, please refill your account");
            return;
        }

        if (item.reduceQuantity() == 0)
            itemsInStock.remove(item);

        customer.reduceBalance(item.getPrice());
        customer.addPurchasedItem(item);
    }
}
