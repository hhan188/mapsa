package tamrin10.s14p36;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public void setLength(double length) {
        if (length <= 0) {
            this.length = 0;
            return;
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            this.width = 0;
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return length * width;
    }
}
