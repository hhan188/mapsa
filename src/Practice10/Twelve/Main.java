package Practice10.Twelve;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Rectangle width is : "+rectangle.getWidth());
        System.out.println("Rectangle length is : "+rectangle.getLength());
        System.out.println("Rectangle area is : "+rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid height is :  "+cuboid.getHeight());
        System.out.println("cuboid area is : "+cuboid.getArea());
        System.out.println("cuboid volume is : " + cuboid.getVolume());
    }
}
