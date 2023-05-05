package Practice9.UpNDownCasting.P1;

public class Using {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        Shape[] shapes = {circle, rectangle};

        shapes[0].draw();
        shapes[1].draw();
        circle.enlarge();
        rectangle.shrink();
    }
}
