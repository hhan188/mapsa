package SoheylSayyah.Practice9.Final.Circle;

public class Circle {
    private double area;
    private final double PI =3.14;

    public Circle(double radius) {
        area = radius * radius * 3.14;
    }
    public void getArea(){
        System.out.println(area);
    }
}
