package tamrin6.P6;

public class Circle {
    private double radius;
    private final double pi;

    public Circle(double radius) {
        this.radius = radius;
        this.pi = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }


}
