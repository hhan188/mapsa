package SoheylSayyah.Practice9.UpCastingAndDownCasting.Exercise1;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();
        }
        Circle circle = new Circle();
        circle.enlarge();
        Rectangle rectangle = new Rectangle();
        rectangle.shrink();
        Circle shape1 = (Circle) new Shape();
        Rectangle shape2 = (Rectangle) new Shape();
        shape1.enlarge();
        shape2.shrink();
    }
}
