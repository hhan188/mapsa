package Practice7.TowenySix;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("red","none",2);
        Rectangle rectangle = new Rectangle("yellow","3",2,3);
        Square square = new Square("black","4",5);
        System.out.println(circle.getArea());
        System.out.println(rectangle.getArea());
        System.out.println(square.getArea());
    }


}
