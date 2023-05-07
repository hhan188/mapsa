package tamrin10.s6p33;

public class Carpet {
    private double cost;

    public Carpet(double cost){
        setCost(cost);
    }

    private void setCost(double cost) {
        if (cost < 0){
            this.cost = 0;
            return;
        }
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
