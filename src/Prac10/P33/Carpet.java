package Prac10.P33;

public class Carpet {
    private String name;
    private double cost;

    public Carpet (double cost) {
        this.name = "oskol";
        this.cost = cost <= 0 ? 0 : cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
