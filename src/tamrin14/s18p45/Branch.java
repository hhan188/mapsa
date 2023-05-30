package tamrin14.s18p45;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers(){
        return customers;
    }

    public boolean newCustomer(String customerName, Double initialTransaction){
        if (findCustomer(customerName) == null) {
            Customer newCustomer = new Customer(customerName);
            newCustomer.addTransaction(initialTransaction);
            return customers.add(newCustomer);
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, Double customerTransaction){
        if (findCustomer(customerName) != null){
            findCustomer(customerName).addTransaction(customerTransaction);
            return true;
        }

        System.out.println(Main.ANSI_RED + "No such a customer with the name " + customerName + " exists!");
        System.out.println(Main.ANSI_RESET);
        return false;

    }

    private Customer findCustomer(String customerName){
        for (Customer c : customers) {
            if (c.getName().equals(customerName))
                return c;
        }
        return null;
    }
}
