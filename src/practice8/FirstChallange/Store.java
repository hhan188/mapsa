package practice8.FirstChallange;


import practice8.FirstChallange.Customer;
import practice8.FirstChallange.Item;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Item> itemsInStock=new ArrayList<>();//yeki az fieldhash ye arraye i az object haye classe Iteme be esme itemsin

    private ArrayList <Customer> customers=new ArrayList<>();



    public void addCustomer(Customer customer){
        customers.add(customer);
        System.out.println("customer added succesfully.");

    }

    public void addItem(Item item){
        itemsInStock.add(item);
        System.out.println("item added succesfully.");


    }
    public void sellItem(Customer customer, Item item) {
        if (itemsInStock.contains(item) && customer.getBalance() >= item.getPrice()) {
            item.setQuantity(item.getQuantity() -1 );
            itemsInStock.remove(item);
            customer.getItemsPurchased().add(item);
            customer.setBalance(customer.getBalance()-item.getPrice());
            System.out.println("item is sold succesfully.");

        }
    }
    public Store(String name, ArrayList<Item> itemsInStock, ArrayList<Customer> customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }



    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", itemsInStock=" + itemsInStock.toString() +
                ", costumers=" + customers.toString() +
                '}';
    }

}
