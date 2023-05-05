package tamrin9.Final.p2;

public class Circle {

    private static final double PI = 3.14;

    private double radius;

    private double area;

    public Circle(double radius) {
        this.radius = radius;
        this.area = radius * radius * PI;
    }

    public double getArea() {
        return area;
    }
}
