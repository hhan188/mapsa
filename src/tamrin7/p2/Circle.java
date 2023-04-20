package tamrin7.p2;
//Problem 2
public class Circle extends Shape{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        System.out.println("The color of the circle is: " + super.getColor());
        return super.getColor();
    }
}
