package Practice7.TowenySix;

public class Square extends Rectangle {
    private double sideLength;

    public Square(String color, String filled, double sideLength) {
        super(color, filled,0,0);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public double getArea(){
        return sideLength*sideLength;
    }
}
