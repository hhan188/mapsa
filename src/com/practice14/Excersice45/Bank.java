package com.practice14.Excersice45;

import java.util.ArrayList;
import java.util.List;

public class Bank
{
    private String name;
    private ArrayList <Branch> branches;

    public Bank(String name)
    {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) throws BranchAlreadyExist
    {
        if (findBranch(branchName) != null)
        {
            throw new BranchAlreadyExist("This Branch Already Exist");
        }
        else if (findBranch(branchName) == null)
        {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction)
    {

        if (findBranch(branchName) != null)
        {
            //Branch item = findBranch(branchName);
            findBranch(branchName).newCustomer(customerName, initialTransaction);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction)
    {
        if (findBranch(branchName) != null)
        {
            findBranch(branchName).addCustomerTransaction(customerName, transaction);
            return true;
        }
        return false;
    }

    public Branch findBranch(String branchName)
    {
        for (Branch item:branches)
        {
            if (item.getName().equals(branchName))
            {
                return item;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransaction)
    {
        List <Customer> customers = findBranch(branchName).getCustomers();
        Branch branch = findBranch(branchName);
        if ( branch != null)
        {
            if (printTransaction)
            {
                System.out.println("Customer details for branch " + branch.getName());
                for (int i=0; i<customers.size(); i++ )
                {
                    System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");
                    if (customers.get(i).getTransactions().size() > 0)
                    {
                        System.out.println("Transactions");
                        for (int j = 0; j < customers.get(i).getTransactions().size(); j++)
                        {
                            System.out.println("[" + (j + 1) + "]" + "  Amount " + customers.get(i).getTransactions().get(j));
                        }
                    }
                    else
                    {
                        System.out.println("No Transactions");
                    }
                }
            }
            else
            {
                System.out.println("Customer details for branch " + branch.getName());
                for (int i=0; i<customers.size(); i++ )
                {
                    System.out.println("Customer: " + customers.get(i).getName() + '[' + (i + 1) + ']');
                }
            }
            return true;
        }
        return false;
    }
}
