package tamrin9.UpDownCasting.p1;

public class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    void enlarge() {
        System.out.println("Enlarging circle...");
    }
}
