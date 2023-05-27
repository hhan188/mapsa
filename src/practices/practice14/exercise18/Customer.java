package practices.practice14.exercise18;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Double> transactions;

    public Customer(String name, Double transaction) {
        this.name = name;
        this.transactions = new ArrayList<>();
        getTransactions().add(transaction);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Double> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    /*
     * methods
     * */
    public boolean addTransaction(Double transaction) {
      return   getTransactions().add(transaction);

    }
}
