package practices.practice7.exercise6;

import java.util.Arrays;
import java.util.Random;

public class SmallestElement {
    public static double minElement(int length) {
        double[] doubles = new double[length];
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = new Random().nextInt(8889799) / ((double) new Random().nextInt(9) + 1);
        }
        System.out.println(Arrays.toString(doubles));
        for (int i = 0; i < doubles.length; i++) {
            if (doubles[i] < min) {
                min = doubles[i];
            }
        } return min;
    }
}

