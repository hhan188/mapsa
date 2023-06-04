package com.practice14.Excersice45;

import java.util.ArrayList;

public class Branch
{
    private String name;
    private ArrayList <Customer> customers;

    public Branch(String name)
    {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public ArrayList<Customer> getCustomers()
    {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction)
    {

        if (findCustomer(customerName) == null)
        {
            customers.add(new Customer(customerName, initialTransaction));
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction)
    {
        if (findCustomer(customerName) != null)
        {
            findCustomer(customerName).addTransaction(transaction);
        }

        return false;
    }

    public Customer findCustomer(String customerName)
    {
        for (Customer item: customers)
        {
            if (item.getName().equalsIgnoreCase(customerName))
            {
                return item;
            }
        }
        return null;
    }


}
