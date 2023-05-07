package tamrin10.s14p36;

public class Cuboid extends Rectangle{

    private double height;


    public Cuboid(double length, double width, double height) {
        super(length, width);
        setHeight(height);
    }

    public void setHeight(double height) {
        if (height <= 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return height * getArea();
    }

}
