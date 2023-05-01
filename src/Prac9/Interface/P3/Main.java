package Prac9.Interface.P3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Drawable[] drawables = {rectangle, circle, triangle};
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
