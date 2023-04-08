package practices.practice7.exercise16;

import java.text.Format;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getCircumference(){
        return Math.abs(2*Math.PI*this.radius);
    }

    @Override
    public String toString() {
        return "{" +
                "radius=" + radius +
                " circumference=" + this.getCircumference() +
                '}';
    }
}
