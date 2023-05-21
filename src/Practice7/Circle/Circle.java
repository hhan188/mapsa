package Practice7.Circle;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double circumference(int radius){
        return (double) ((radius*radius)*Math.PI);
    }
}
