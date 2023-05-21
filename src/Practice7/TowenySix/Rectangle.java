package Practice7.TowenySix;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, String filled,double width , double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
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
    public double getArea(){
        return width*height;
    }
}
