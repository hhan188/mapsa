package Practice10.Five;

public class Main {
    public static void main(String[] args) {
        WallArea wall = new WallArea(5,4);
        System.out.println(wall.getArea());
        wall.setHeight(-2);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());
        System.out.println(wall.getArea());
    }
}
