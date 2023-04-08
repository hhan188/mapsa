package test.inheritance1.arrays1.exercise8;

import java.util.Arrays;
import java.util.Random;

public class LargestElement {
    public static int maxElement(int length) {
        int[] ints = new int[length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(999);
        }
        System.out.println(Arrays.toString(ints));
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        } return max;
    }
}
