package tamrin9.UpDownCasting.p1;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[5];

        shapes[0] = new Circle();
        shapes[1] = new Circle();
        shapes[2] = new Rectangle();
        shapes[3] = new Rectangle();
        shapes[4] = new Rectangle();

        for (Shape sh: shapes) {
            sh.draw();
        }

        Circle c1 = (Circle) shapes[0];
        var c2 = (Circle) shapes[1];
        c1.enlarge();
        c2.enlarge();

        Rectangle r1 = (Rectangle) shapes[2];
        Rectangle r2 = (Rectangle) shapes[3];
        var r3 = (Rectangle) shapes[4];
        r1.shrink();
        r2.shrink();
        r3.shrink();

    }
}
