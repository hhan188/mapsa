package SoheylSayyah.Practice10.Exercise32;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("Distance (0,0) = " + first.distance());
        System.out.println("Distance (second) = " + first.distance(second));
        System.out.println("Distance (2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("Distance = " + point.distance());
    }
}
