package Prac7;

/**
 * practice about using object as arguments of methods or return type of methods - Soale 10
 * Create a class called Customer with properties for name and total purchases.
 * Write a method that takes in an array of Customer objects and returns the name of the customer with the highest total purchases.
 */
public class Customer {
    private String name;
    private int totalPurchases;

    Customer(String name, int totalPurchases) {
        this.name = name;
        this.totalPurchases = totalPurchases;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalPurchases(int totalPurchases) {
        this.totalPurchases = totalPurchases;
    }

    public String getName() {
        return name;
    }

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public static String loyalCustomer(Customer[] customers) {
        int max = 0;
        String name = "";
        for (Customer customer : customers) {
            if (customer.getTotalPurchases() > max) {
                max = customer.getTotalPurchases();
                name = customer.getName();
            }
        }
        return name;
    }
}
