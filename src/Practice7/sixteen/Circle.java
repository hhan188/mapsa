package Practice7.sixteen;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double circumference(){
        return Math.PI*2*radius;
    }
}
