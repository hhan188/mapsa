package tamrine45;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Bank bank=new Bank("National Australia Bank");
        Branch branch1=new Branch("astara");
        bank.addBranch("astara");

        Branch branch2=new Branch("Hello");
        Branch branch3=new Branch("Happy");
        bank.addCostumerTransaction("astra","yaser",8);
        System.out.println(bank);
        ArrayList<Branch> myBranches=new ArrayList<>();


        Collections.addAll(myBranches,branch1,branch2,branch3);
        //Bank bank=new Bank("National Australia Bank",myBranches);

        bank.addBranch("adelaide");
//        bank.addCostumer("Adelaide","Tim",50.05);
//        bank.addCostumer("Adelaide","Mike",175.34);
//        bank.addCostumer("Adelaide","Percy",220.12);

        bank.addCostumerTransaction("Adelaide","Tim",44.22);
        bank.addCostumerTransaction("Adelaide","Tim",12.44);
        bank.addCostumerTransaction("Adelaide","Tim",1.65);
     //   bank.listCostumers("Adelaide",true);

    }
}
