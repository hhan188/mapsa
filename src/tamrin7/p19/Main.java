package tamrin7.p19;

public class Main {
    public static void main(String[] args) {
        Circle[] circleArray = new Circle[3];
        circleArray[0] = new Circle(1);
        circleArray[1] = new Circle(4);
        circleArray[2] = new Circle(9);

        double totalArea = calcTotalArea(circleArray);
        System.out.println("total area is: " + totalArea);

    }

    private static double calcTotalArea(Circle[] circleArray) {

        double totalArea = 0;

        for (Circle circle : circleArray
        ) {
            totalArea += Math.pow(circle.getRadius(), 2) * Math.PI;
        }
        return totalArea;
    }
}

