package practices.practice7.exercise26;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Colors color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Colors color, boolean filled) {
        super(color, filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
