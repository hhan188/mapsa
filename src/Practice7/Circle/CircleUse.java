package Practice7.Circle;

import Practice7.Circle.Circle;

public class CircleUse {
    public static void main(String[] args) {
        Circle[] circle = new Circle[4];
        circle[0] = new Circle(10);
        circle[1] = new Circle(20);
        circle[2] = new Circle(12);
        circle[3] = new Circle(4);
        for (int i = 0; i < circle.length; i++) {
            System.out.println(circle[i].getRadius());

        }
        System.out.println("circumference 1 is "+ circle[0].circumference(10));
        System.out.println("circumference 2 is "+ circle[1].circumference(20));
        System.out.println("circumference 3 is "+ circle[2].circumference(12));
        System.out.println("circumference 4 is "+ circle[3].circumference(4));

    }
}
