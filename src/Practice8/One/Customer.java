package Practice8.One;

import java.util.Arrays;

public class Customer {
    String name;
    double balance;
    Item[] itemsPurchased;

    public Customer(String name, double balance, Item[] itemsPurchased) {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = itemsPurchased;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "itemsPurchased=" + Arrays.toString(itemsPurchased) +
                '}';
    }
}
