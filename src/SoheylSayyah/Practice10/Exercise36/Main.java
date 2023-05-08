package SoheylSayyah.Practice10.Exercise36;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Rectangle Width is : " + rectangle.getWidth());
        System.out.println("Rectangle Length is : " + rectangle.getLength());
        System.out.println("Rectangle Area is : " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("Cuboid Width is : " + cuboid.getWidth());
        System.out.println("Cuboid Length is : " + cuboid.getLength());
        System.out.println("Cuboid Area is : " + cuboid.getArea());
        System.out.println("Cuboid Height is : " + cuboid.getHeight());
        System.out.println("Cuboid Volume is : " + cuboid.getVolume());
    }
}
