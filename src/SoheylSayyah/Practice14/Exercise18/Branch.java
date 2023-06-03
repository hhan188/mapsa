package SoheylSayyah.Practice14.Exercise18;

import java.util.ArrayList;

public class Branch
{
    private String name;
    ArrayList<Customer> customers;
    public Branch(String name)
    {
        this.name = name;
        customers = new ArrayList<>();
    }
    public String getName()
    {
        return name;
    }
    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }
    public boolean newCustomer(String name,double transaction){
        return customers.add(new Customer(name,transaction));
    }
    public boolean addCustomerTransaction(String name,double transaction) throws RuntimeException{
//        Customer customer = customers.stream()
//                .filter(c -> c.getName().equals(name))
//                .findFirst()
//                .orElseThrow(() -> new RuntimeException("customer not found!"));
//        customer.addTransaction(transaction);
        for (Customer customer : customers){
            if (customer.getName().equalsIgnoreCase(name)){
                customer.addTransaction(transaction);
                return true;
            }
        }
        return false;
    }
    public Customer findCustomer(String name){
        for (Customer customer : customers){
            if (customer.getName().equalsIgnoreCase(name)){
                return customer;
            }
        }
        return null;
    }
}
