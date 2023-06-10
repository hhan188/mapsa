package tamrine45;

import java.util.ArrayList;

public class Bank {
    private String nameBank;
    private ArrayList<Branch> branches=new ArrayList<>();


    public Bank(String nameBank,ArrayList<Branch> branches) {
        this.nameBank = nameBank;
        this.branches = branches;
    }



    public Bank(String nameBank) {
        this.nameBank = nameBank;
    }


    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }


    public boolean addBranch(String name) {
            return branches.add(new Branch(name));

    }

    public static void main(String[] args) {
        Bank bank=new Bank("nnn");
        System.out.println(bank.addBranch("yyy"));
    }

//    public boolean addCostumer(String nameBranch, String nameCostumer, double transaction) {
//        {
//            getCostumers().add(new Costumer(nameCostumer, transaction));return true;
//        }
//        return false;
//    }

    public boolean addCostumerTransaction(String nameBranch, String nameCostumer, double transaction) {
        if (!findBranch(nameBranch).equals(null)) {
            return true;
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (int i = 0; i < getBranches().size(); i++) {
            if (name.equals(getBranches().get(i).getName())){
                return getBranches().get(i);
            }

        }return null;
    }
//    public boolean listCostumers(String nameBranch,boolean printTransaction){
//        if(!findBranch(nameBranch).equals(null)){
//            if(printTransaction==true){
//                int counter=1;
//                for(Costumer costumer:getCostumers()){
//                    System.out.println("["+counter+"] Amount "+costumer.getTransaction());
//                }
//
//            }
//            return true;
//        }
//        return false;
//    }
//    }
}
