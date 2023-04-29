package Store;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        Store store = new Store();

        store.setItemsInStock(new ArrayList<>());
        store.setCustomers(new ArrayList<>());

        Item shoes = new Item("shoes", 500, 3);
        Item hat = new Item("hat", 300, 3);
        Item glasses = new Item("glasses", 1000, 3);
        Item handsFree = new Item("handsFree", 2500, 1);
        store.addItem(shoes);
        store.addItem(hat);
        store.addItem(glasses);
        store.addItem(handsFree);

        List<Item> itemList1 = new ArrayList<>();
        Customer customer1 = new Customer("Reza", 2500, itemList1);
        store.addCustomer(customer1);

        store.sellItem(customer1, hat);
        System.out.println(customer1);
        System.out.println(store);


    }
}
