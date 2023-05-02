package practices.practice9.finaltxt.circle;

public class Circle {
    private final double pi = 3.14;
    private final double radius;
    private final double area;

    public Circle(double radius) {
        this.radius = radius;
        area = radius * radius * pi;
    }

    public double getArea() {
        return area;
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }


}
