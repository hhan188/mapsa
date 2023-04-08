package practices.practice7.exercise26;

public class Square extends Rectangle{
    private double sideLength;

    public Square(Colors color, boolean filled,  double sideLength) {
        super(color, filled);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea() {
        return Math.pow(this.sideLength,2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}
