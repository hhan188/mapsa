package SoheylSayyah.Practice7.Exercise19;

public class UsingCircle {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1);
        circles[1] = new Circle(2);
        circles[2] = new Circle(3);
        double sum = 0;
        for (Circle items : circles) {
            sum += items.getArea();
        }
        System.out.println(sum);
    }
}
