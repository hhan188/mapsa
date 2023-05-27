package practices.practice14.exercise18;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private String name;
    private List<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    /*
     * methods
     * */


    public boolean newCustomer(String name, Double transaction) {
        return getCustomers().add(new Customer(name, transaction));
    }

    public boolean addCustomerTransaction(String customerName, Double transaction) {
        Customer customer = new Customer(customerName,transaction);
            return customer.getTransactions().add(transaction);

    }

    public Customer findCustomer(String customerName) {

        for (int i = 0; i < getCustomers().size(); i++) {
            if (customerName.equalsIgnoreCase(getCustomers().get(i).getName())) {
                return getCustomers().get(i);
            }
        }
        return null;
    }
}
