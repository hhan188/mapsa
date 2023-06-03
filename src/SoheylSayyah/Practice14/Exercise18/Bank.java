package SoheylSayyah.Practice14.Exercise18;

import java.util.ArrayList;

public class Bank
{
    private String name;
    ArrayList<Branch> branches;
    public Bank(String name)
    {
        this.name = name;
        branches = new ArrayList<>();
    }
    public boolean addBranch(String name){
        return branches.add(new Branch(name));
    }
    public boolean addCustomer(String branchName,String customerName,double transaction){
        return true;
    }
}
