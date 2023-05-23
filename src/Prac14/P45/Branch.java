package Prac14.P45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initTransaction) {
        if (findCustomer(name) == null) {
            customers.add(new Customer(name, initTransaction));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer != null) {
            customer.addTranscation(transaction);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String name) {
        return customers.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
