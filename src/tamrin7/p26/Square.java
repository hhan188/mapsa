package tamrin7.p26;

public class Square extends Rectangle{

    private double sideLength;

    public Square(String color, boolean filled, double sideLength) {
        super(color, filled, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
