package Practice7.Inheritance.twentySix;

public class Rectangle extends Shape{
    int width;
    int height;

    public Rectangle(String color, boolean filled, int width, int height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println(width*height);
    }
}
