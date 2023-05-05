package SoheylSayyah.Practice9.Interface.Exercise3;

public class Main {
    public static void main(String[] args) {
        Drawable[] drawables = new Drawable[3];
        drawables[0] = new Rectangle();
        drawables[1] = new Circle();
        drawables[2] = new Triangle();
        for (int i = 0; i < drawables.length; i++) {
            drawables[i].draw();
        }
    }
}
