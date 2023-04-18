package practices.practice71.exercise26;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle(Colors.Pink,true,2.5);
        System.out.println("circle Area :"+circle.getArea());

        Shape rectAngle=new Rectangle(Colors.Black,false,12,15);
        System.out.println("Rectangle Area :"+rectAngle.getArea());

        Shape square=new Square(Colors.Green,true,10);
        System.out.println("Square Area :"+square.getArea());
        int a=new Random().nextInt(2000);
    }
}
