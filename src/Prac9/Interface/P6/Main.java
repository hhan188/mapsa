package Prac9.Interface.P6;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        rectangle.resize(10);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        rectangle.resize(-30);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
    }
}
