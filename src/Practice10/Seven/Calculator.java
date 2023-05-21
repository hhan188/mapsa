package Practice10.Seven;

public class Calculator {
    private Carpet carpet;
    private Floor floor;

    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}
