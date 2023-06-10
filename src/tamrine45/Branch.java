package tamrine45;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Costumer> costumers=new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public Branch(String name, ArrayList<Costumer> costumers) {
        this.name = name;
        this.costumers = costumers;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCostumers(ArrayList<Costumer> costumers) {
        this.costumers = costumers;
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }
    public boolean newCostumer(String name,double transaction){
        if(findCostumer(name).equals(null)){
            return true;
        }
        return false;
    }
    public boolean addCostumerTransaction(String name,double transaction){
        if(!findCostumer(name).equals(null)){
        for(Costumer costumer:costumers) {
            if(costumer.getTransaction().equals(transaction) ){
                return false;
            }
        }}
        return true;
    }
    private Costumer findCostumer(String name){
            for (Costumer costumer:costumers){
                if(costumer.getName().equals(name)){
                    return costumer;
                }
            }
       return null;
    }
}
