package SoheylSayyah.Practice7.Exercise16;

public class UsingCircle1 {
    public static void main(String[] args) {
        Circle1[] circles = new Circle1[9];
        circles[0] = new Circle1(1);
        circles[1] = new Circle1(2);
        circles[2] = new Circle1(3);
        circles[3] = new Circle1(4);
        circles[4] = new Circle1(5);
        circles[5] = new Circle1(6);
        circles[6] = new Circle1(7);
        circles[7] = new Circle1(8);
        circles[8] = new Circle1(9);
        for (Circle1 item : circles) {
            System.out.println(circumference(item.getRadius()));
        }
    }

    public static double circumference(int radius) {
        return radius * 2 * Math.PI;
    }
}