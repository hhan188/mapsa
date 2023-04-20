package SoheylSayyah.Practice7.Exercise26;

public class Circle extends Shape{
    private int radius;

    public Circle(String color, String filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void getArea(){
        System.out.println((double) radius * radius * Math.PI);
    }
}
