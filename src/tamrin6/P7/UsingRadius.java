package tamrin6.P7;

public class UsingRadius {
    public static void main(String[] args) {
        Radius circle = new Radius(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Diameter: " + circle.getDiameter());

        circle.setRadius(7.0);
        System.out.println("Updated radius: " + circle.getRadius());
        System.out.println("Updated diameter: " + circle.getDiameter());
    }
}
