package Practice7.sixteen;

public class CircleObject {
    public static void main(String[] args) {
        Circle[] circles = new Circle[4];

        for (int i=0;i<4;i++){
            circles[i] = new Circle();

            circles[i].setRadius (18);
            System.out.println(circles[i].getRadius());
            System.out.println(circles[i].circumference());
        }
    }
}
