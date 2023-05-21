package Practice7.CircleShape;

public class CircleShape extends Shape {
    private int radius;

    public CircleShape(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void getColourMethod(){
        System.out.println(this.getColor());
    }
}
