package Practice10.Twelve;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        if (width<0){
            this.width=0;
        }
        if (length<0){
            this.length=0;
        }
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }
    public double getArea(){
        double area = width*length;
        return area;
    }

    public double getLength() {
        return length;
    }
}
