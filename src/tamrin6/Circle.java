package tamrin6;
//Problem 6 & 7 solution
public class Circle {
    private double radius;
    private double pi;

    public Circle(double radius) {
        setRadius(radius);
        this.pi = Math.PI;
    }

    private void setRadius(double radius) {
        if (radius < 0)
            throw new IllegalArgumentException("Circle radius cannot be negative.");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * pi;
    }

    public double getDiameter() {
        return 2 * radius;
    }
}
