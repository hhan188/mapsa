package Prac9.Final.P2;

public class Circle {
    private final double PI = 3.14;
    private final double area;
    Circle(int radius) {
        area = PI * radius * radius;
    }

    public double getArea() {
        return area;
    }
}
