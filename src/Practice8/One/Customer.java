package Practice8.One;

public class Customer {
    String name;
    double balance;
    Item[] itemsPurchased;

    public Customer(String name, double balance, Item[] itemsPurchased) {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = itemsPurchased;
    }
}
