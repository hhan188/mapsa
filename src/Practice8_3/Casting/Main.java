package Practice8_3.Casting;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0]=new Circle();
        shapes[1]=new Rectangle();

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw();

        }



        Shape obj1 = (Shape) new Circle();
        Shape obj2 = (Shape) new Rectangle();



    }



}
