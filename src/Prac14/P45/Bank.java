package Prac14.P45;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<>();
    }

    private Branch findBranch(String name) {
        return branches.stream()
                .filter(b -> b.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initTransaction);
        } else {
            return false;
        }
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double initTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, initTransaction);
        } else {
            return false;
        }
    }

    public void listCustomers(String branchName, boolean printTransactions) {
        if (printTransactions) {
            listCustomersWithTransactions(branchName);
        } else {
            listCustomersNoTransactions(branchName);
        }
    }

    private void listCustomersWithTransactions(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            AtomicInteger customerCount = new AtomicInteger(1);

            branch.getCustomers()
                    .forEach( //Loop in customers of branch
                            (customer) -> {
                                System.out.println("Customer : " + customer.getName() + "[" + customerCount + "]");
                                System.out.println("Transactions : ");
                                AtomicInteger transactionsCount = new AtomicInteger(1);

                                customer.getTranscations()
                                        .forEach( //Loop in transactions of customer
                                                (transaction) -> {
                                                    System.out.println("[" + transactionsCount + "]" + " Amount " + transaction);
                                                    transactionsCount.getAndIncrement();
                                                }
                                        );

                                customerCount.getAndIncrement();
                            }
                    );

        } else {
            System.err.println("branch not found");
        }
    }

    private void listCustomersNoTransactions(String branchName) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            AtomicInteger customerCount = new AtomicInteger(1);

            branch.getCustomers()
                    .forEach( //Loop in customers of branch
                            (customer) -> {
                                System.out.println("Customer : " + customer.getName() + "[" + customerCount + "]");
                                customerCount.getAndIncrement();
                            }
                    );

        } else {
            System.err.println("branch not found");
        }
    }
}
