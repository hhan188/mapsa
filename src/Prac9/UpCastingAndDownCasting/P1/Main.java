package Prac9.UpCastingAndDownCasting.P1;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();
        Shape[] shapes = {shape1, shape2};
        for (Shape shape : shapes) {
            shape.draw();
        }


        Rectangle rectangle = (Rectangle) shape1;
        rectangle.shrink();

        Circle circle = (Circle) shape2;
        circle.enlarge();
    }
}
