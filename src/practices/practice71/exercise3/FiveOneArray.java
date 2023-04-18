package practices.practice71.exercise3;

import java.util.Arrays;

public class FiveOneArray {
    public static void print(int length) {
        double[] doubles = new double[length];
        for (int i = 0; i < length; i++) {
            doubles[i] = 1;
        }
        System.out.println(Arrays.toString(doubles));
    }
}
