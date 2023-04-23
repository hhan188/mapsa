package Practice8.One;

public class StoreObject {
    public static void main(String[] args) {
        Item[] items = new Item[2];
        items[0] = new Item("Monitor", 100, 1);
        items[1] = new Item("GPU", 200,1);
        Customer[] customers = new Customer[1];
        customers[0] = new Customer("Ali", 200, items);
        Store store = new Store("Fafa It", items, customers);

        store.addItem(items[0]);
        store.addItem(items[1]);
        store.addCustomer(customers[0]);
        store.sellItem(customers[0], items[0]);
    }
}
