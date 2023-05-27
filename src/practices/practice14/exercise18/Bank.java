package practices.practice14.exercise18;

import com.google.gson.Gson;

import javax.swing.plaf.basic.BasicTreeUI;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }




    /*
     * methods
     * */

    public boolean addBranch(String name) {
        return getBranches().add(new Branch(name));
    }

    public boolean addCustomer(String branchName, String customerName, Double transaction) {
        Branch branch = new Branch(branchName);
        Customer customer = new Customer(customerName, transaction);
        branch.getCustomers().add(customer);
        return getBranches().add(branch);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, Double transaction) {
        Branch branch = findBranch(branchName);
        if (findBranch(branchName) != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public Branch findBranch(String name) {
        for (int i = 0; i < getBranches().size(); i++) {
            if (name.equalsIgnoreCase(getBranches().get(i).getName())) {
                return getBranches().get(i);
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            for (int i = 1; i <getBranches().size() ; i++) {
                System.out.println(getBranches().get(i));
            }
            printTransactions = true;
        }
        return printTransactions;
    }



}
