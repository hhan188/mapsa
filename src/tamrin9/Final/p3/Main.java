package tamrin9.Final.p3;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(15,25);
        System.out.println("Rectangle w:15 h:25 area is: " + r1.calcRectangleArea());

        Rectangle r2 = new Rectangle(36);
        System.out.println("Rectangle side 36 area is: " + r2.calcRectangleArea());
    }
}
