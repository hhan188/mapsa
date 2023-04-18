package practices.practice7.exercise26;

public class Main {
    public static void main(String[] args) {
        Shape circle=new Circle(Colors.Pink,true,2.5);
        System.out.println("circle Area :"+circle.getArea());

        Shape rectAngle=new Rectangle(Colors.Black,false,12,15);
        System.out.println("Rectangle Area :"+rectAngle.getArea());

        Shape square=new Square(Colors.Green,true,10);
        System.out.println("Square Area :"+square.getArea());
    }
}
