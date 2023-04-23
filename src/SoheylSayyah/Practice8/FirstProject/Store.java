package SoheylSayyah.Practice8.FirstProject;

import java.util.ArrayList;

public class Store {
    private String name;
    private static ArrayList<Item> itemsInStock;
    private ArrayList<Customer> customers;
    public Store(String name, ArrayList<Item> itemsInStock, ArrayList<Customer> customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
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
    public void sellItem(Customer customer,Item item){
        if (customer.getBalance() >= item.getPrice() && itemsInStock.contains(item)){
            itemsInStock.remove(item);
            customer.getItemsPurchased().add(item);
            customer.setBalance(customer.getBalance() - item.getPrice());
        }
    }
}
