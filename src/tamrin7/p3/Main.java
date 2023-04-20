package tamrin7.p3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] fiveDoubles = new double[5];
        for (int i = 0; i < fiveDoubles.length; i++) {
            fiveDoubles[i] = 1.0;
        }
        //?
/*
        for (double element: fiveDoubles) {
            element = 1.0;
        }
*/
        System.out.println(Arrays.toString(fiveDoubles));
    }
}
