package tamrine45;

import java.util.ArrayList;
import java.util.Date;

public class Costumer {
    private String name;
    private ArrayList<Double> transactions;
    public Costumer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransaction() {
        return transactions;
    }
    private void addTransaction(double transaction){

    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", transactions=" + transactions +
                '}';
    }
}
