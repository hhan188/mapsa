package practices.practice10.exercise35;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            radius = 0;
        }
        this.radius = radius;
    }

    protected double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}
