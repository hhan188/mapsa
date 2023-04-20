package tamrin7.p16;

public class Main {
    public static void main(String[] args) {

        Circle[] circles = {new Circle(1),
                new Circle(1.5),new Circle(2),
                new Circle(2.5),new Circle(3),
                new Circle(3.5),new Circle(4),
                new Circle(4.5),new Circle(5),
        };

        for (Circle circle: circles) {
            System.out.print(circle.getRadius() + " -> " );
            System.out.printf("%5.2f%n", circle.circumference());
        }

    }
}

