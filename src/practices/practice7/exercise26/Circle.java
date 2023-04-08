package practices.practice7.exercise26;

public class Circle extends Shape {
    private double radius;
    public Circle() {
    }

    public Circle(Colors color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString()+" Circle{" +
                "radius=" + radius +
                '}';
    }
}
