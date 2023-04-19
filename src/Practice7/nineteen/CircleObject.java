package Practice7.nineteen;

import java.util.Arrays;

public class CircleObject {
    public static void main(String[] args) {
        double[] circlesArea = new double[2];
        Circle[] circles = {new Circle(4),new Circle(2)};
        for (int i = 0; i < 2; i++) {
            circlesArea[i] = circles[i].getRadius()*Math.PI*2;
        }
        System.out.println(Arrays.toString(circlesArea));

    }
}
