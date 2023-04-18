package practices.practice71.exercise2;

public class Circle extends Shape{

private double radius;


    public Circle(String color) {
        super(color);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
