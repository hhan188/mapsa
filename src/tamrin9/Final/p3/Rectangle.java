package tamrin9.Final.p3;

public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        this.width = side;
        this.height = side;
    }

    public double calcRectangleArea(){
        return width * height;
    }

}
