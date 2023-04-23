package SoheylSayyah.Practice8.FirstProject;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>(3);
        items.add(new Item("Banana",20,5));
        items.add(new Item("Apple",25,10));
        items.add(new Item("Lemon",15,3));
        ArrayList<Customer> customers = new ArrayList<Customer>(3);
        customers.add(new Customer("Soheyl",5000,items));
        customers.add(new Customer("Ehsan",8000,items));
        customers.add(new Customer("Ali",6000,items));
        ArrayList<Item> itemsInStock = new ArrayList<Item>(5);
        itemsInStock.add(new Item("Banana",20,5));
        itemsInStock.add(new Item("Apple",25,10));
        itemsInStock.add(new Item("Lemon",15,3));
        itemsInStock.add(new Item("Eggplant",10,6));
        itemsInStock.add(new Item("Egg",28,2));
        Store store = new Store("Daryaniha",itemsInStock,customers);
        Customer customer = new Customer("Ehsan",8000,items);
    }
}
