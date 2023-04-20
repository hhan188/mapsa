package SoheylSayyah.Practice7.Exercise26;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(String color, String filled, int width, int height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void getArea(){
        System.out.println(width * height);
    }
}
