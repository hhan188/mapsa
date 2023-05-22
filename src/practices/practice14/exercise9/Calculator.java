package practices.practice14.exercise9;

public class Calculator {

    private Floor floor;
    private Carpet carpet;

    public Calculator() {
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }

    public void setCarpet(Carpet carpet) {
        this.carpet = carpet;
    }

    protected double getTotalCost(){
        return getCarpet().getCost()*getFloor().getArea();
    }


}
