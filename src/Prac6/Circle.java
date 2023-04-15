package Prac6;

public class Circle {
    private double radius;
    private double PI;
    public Circle() {
        PI = 3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
