package Prac9.Final.P3;

public class Rectangle {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    Rectangle(double length) {
        this(length, length);
    }

    public double calcArea() {
        if (width == height)
            return width * width;
        else
            return width * height;
    }
}
