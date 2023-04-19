package Practice7.Inheritance.twentySix;

public class Square extends Shape {
    int sideLength;

    public Square(String color, boolean filled, int sideLength) {
        super(color, filled);
        this.sideLength = sideLength;
    }

    @Override
    public void getArea() {
        System.out.println(sideLength*sideLength);
    }
}
