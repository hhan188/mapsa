package practices.practice9.finaltxt.rectangle;

public class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double height) {
        this(height, height);
    }

    public double getArea() {
        return getWidth() * getHeight();

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
