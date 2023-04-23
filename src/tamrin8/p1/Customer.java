package tamrin8.p1;

import java.text.NumberFormat;
import java.util.Arrays;

public class Customer {
    private String name;
    private double balance;
    private Item[] itemsPurchased;

    public Customer(String name, double balance, Item[] itemsPurchased) {
        this.name = name;
        this.balance = balance;
        this.itemsPurchased = itemsPurchased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String formattedBalance(){
        NumberFormat n = NumberFormat.getNumberInstance();
        return  n.format(balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Item[] getItemsPurchased() {
        return itemsPurchased;
    }

    public void setItemsPurchased(Item[] itemsPurchased) {
        this.itemsPurchased = itemsPurchased;
    }

    @Override
    public String toString() {
        return "\nCustomer " +
                "name is " + name +
                ", and balance is " + formattedBalance() +
                ",\nitems that this customer are purchased:\n" + Arrays.toString(itemsPurchased) +
                "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - -\n";
    }

}
