package tamrin6;
//Problem 5 & 14 solution
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0)
            this.length = 0;
        else
            this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0)
            this.width = 0;
        else
            this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public int calculateArea(){
        return (int)(length * width);
    }

    public String compareAreas(Rectangle anotherRectangle){
        if (calculateArea() == anotherRectangle.calculateArea())
            return "same area";
        if (calculateArea() < anotherRectangle.calculateArea())
            return "smaller area";
        return "greater area";

    }
}
