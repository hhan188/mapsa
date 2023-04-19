package Practice7.Inheritance.twentySix;

public class Circle extends Shape{
    int radius;

    public Circle(String color, boolean filled, int radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println(Math.PI*radius*2);
    }
}
