package tamrin14.s18p45;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null)
            return branches.add(new Branch(name));

        return false;
    }

    public boolean addCustomer(String branchName, String customerName, Double initialTransaction) {
        if (findBranch(branchName) == null) {
            System.out.println(Main.ANSI_RED + "No such a branch with the name " + branchName + " exists!");
            System.out.println(Main.ANSI_RESET);
            return false;
        }

        return findBranch(branchName).newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, Double customerTransaction) {
        if (findBranch(branchName) == null) {
            System.out.println(Main.ANSI_RED + "No such a branch with the name " + branchName + " exists!");
            System.out.println(Main.ANSI_RESET);
            return false;
        }

        return findBranch(branchName).addCustomerTransaction(customerName, customerTransaction);
    }

    public void listCustomers(String branchName, boolean shouldPrintTransactions) {
        if (findBranch(branchName) == null) {
            System.out.println(Main.ANSI_RED + "No such a branch with the name " + branchName + " exists!");
            System.out.println(Main.ANSI_RESET);
            return;
        }

        System.out.println(Main.ANSI_RED + "Customer details for branch " + branchName + Main.ANSI_RESET);

        ArrayList<Customer> printCustomers = findBranch(branchName).getCustomers();
        ArrayList<Double> printTransactions;

        for (int customer = 0; customer < printCustomers.size(); customer++) {
            System.out.println("Customer: " + printCustomers.get(customer).getName() + "[" + (customer + 1) + "]");
            if (shouldPrintTransactions) {
                printTransactions = printCustomers.get(customer).getTransactions();
                System.out.println(Main.ANSI_CYAN + "Transactions" + Main.ANSI_RESET);
                for (int tran = 0; tran < printTransactions.size(); tran++) {
                    System.out.println("[" + (tran + 1) + "] Amount " + printTransactions.get(tran));
                }
            }
        }


    }

    private Branch findBranch(String name) {
        for (Branch b : branches) {
            if (b.getName().equals(name))
                return b;
        }
        return null;
    }

}
