package practices.practice14.exercise20;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getVolume() {
        return getArea() * getHeight();
    }
}
