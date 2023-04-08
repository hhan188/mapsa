package practices.practice7.exercise5;

import java.util.Arrays;
import java.util.Random;

public class AverageOfArray {
    public static double sum(int length) {
        int[] ints = new int[length];
        double sum = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(15);
            sum += ints[i];
        }
        System.out.println(Arrays.toString(ints));
        return sum/ ints.length;
    }

}
