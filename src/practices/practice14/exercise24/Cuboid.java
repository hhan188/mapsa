package practices.practice14.exercise24;

public class Cuboid extends Rectangle {


    private double height;

    public Cuboid(double height) {
        this.height = height;
    }

    public Cuboid(double width, double length, double height) {
        super(width, length);
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
    protected double getVolume(){
        return getArea()*getHeight();
    }
}
