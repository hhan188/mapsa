package Practice9.Inface.Three;

public class Using {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Drawable[] drawables = {rectangle, circle, triangle};
        drawables[0].draw();
        drawables[1].draw();
        drawables[2].draw();
    }
}
