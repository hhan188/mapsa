package Tamrin8;

import java.util.ArrayList;
import java.util.Arrays;

public class Store {
    private String name;
    private ArrayList<Item> itemsInStock;
    private ArrayList<Customer> customers;

   /* int counter = 0;
    int counterItem = 0;*/

    public void addCustomer(Customer customer) {

        customers.add(customer);
        //this.customers[counter] = customer;
        //counter = counter + 1;
    }

    public void addItem(Item item) {
        itemsInStock.add(item);
        //this.itemsInStock[counter] = item;
        //counterItem++;
    }

    public void sellItem(Customer customer, Item item) {
        if (itemsInStock.contains(item) && customer.getBalance() >= item.getPrice()) {
            item.setQuantity(item.getQuantity() - 1);

            ArrayList<Item> customerItems = customer.getItemsPurchased();
            int q = 1;
            if (customerItems.contains(item)) {
                q = item.getQuantity() + 1;
                item.setQuantity(q);
            } else if (customerItems.contains(item) == false) {
                Item customerItem = new Item(item.getName(), item.getPrice(), q);
                customerItems.add(customerItem);
            }
            customer.setItemsPurchased(customerItems);
            customer.setBalance(customer.getBalance() - item.getPrice());

        }
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", itemsInStock=" + itemsInStock.toString() +
                ", customers=" + customers.toString() +
                '}';
    }

    public Store(String name, ArrayList<Item> itemsInStock, ArrayList<Customer> customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }
}
