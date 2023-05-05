package tamrin9.interfaces.p3;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle();
        shapes[5] = new Circle();
        shapes[1] = new Rectangle();
        shapes[4] = new Rectangle();
        shapes[2] = new Triangle();
        shapes[3] = new Triangle();

        for (Shape sh: shapes) {
            sh.draw();
        }

    }
}
