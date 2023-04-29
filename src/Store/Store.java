package Store;

import java.util.List;

public class Store {

    private String name;
    private List<Item> itemsInStock;
    private List<Customer> customers;

    public Store(String name, List<Item> itemsInStock, List<Customer> customers) {
        this.name = name;
        this.itemsInStock = itemsInStock;
        this.customers = customers;
    }

    public Store() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItemsInStock() {
        return itemsInStock;
    }

    public void setItemsInStock(List<Item> itemsInStock) {
        this.itemsInStock = itemsInStock;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public String toString() {
        return "Store.Store{" +
                "name='" + name + '\'' +
                ", itemsInStock=" + itemsInStock +
                ", customers=" + customers +
                '}';
    }

    public void addItem(Item item) {
        itemsInStock.add(item);
    }

    public void sellItem(Customer customer, Item item) {

        if (itemsInStock.contains(item) && customer.getBalance() >= item.getPrice()) {

            itemsInStock.remove(item);
            customer.getItemsPurchased().add(item);
            customer.setBalance(customer.getBalance() - item.getPrice());
        }else System.out.println("not enough money");
    }


}
