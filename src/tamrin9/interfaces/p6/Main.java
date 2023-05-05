package tamrin9.interfaces.p6;

public class Main {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(100,200);
        System.out.println("Rectangle:");
        System.out.println(r1);

        r1.resize(50);
        System.out.println("After resize 50% :");
        System.out.println(r1);

        r1.resize(400);
        System.out.println("After resize 400% :");
        System.out.println(r1);


    }
}
