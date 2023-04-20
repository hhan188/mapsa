package SoheylSayyah.Practice7.Exercise2;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void getColorMethod(){
        System.out.println(this.getColor());
    }
}
