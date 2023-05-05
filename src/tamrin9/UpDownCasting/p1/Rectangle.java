package tamrin9.UpDownCasting.p1;

public class Rectangle extends Shape{

    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    void shrink() {
        System.out.println("Shrinking rectangle...");
    }

}
