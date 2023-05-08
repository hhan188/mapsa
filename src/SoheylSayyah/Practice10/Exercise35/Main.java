package SoheylSayyah.Practice10.Exercise35;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("Circle Radius is : " + circle.getRadius());
        System.out.println("Circle Area is : " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Cylinder Radius is : " + cylinder.getRadius());
        System.out.println("Cylinder Height is : " + cylinder.getHeight());
        System.out.println("Cylinder Area is : " + cylinder.getArea());
        System.out.println("Cylinder Volume is : " + cylinder.getVolume());
    }
}
