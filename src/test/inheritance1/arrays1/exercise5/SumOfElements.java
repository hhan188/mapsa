package test.inheritance1.arrays1.exercise5;

import java.util.Arrays;
import java.util.Random;

public class SumOfElements {
    public static int sum(int length) {
        int[] ints = new int[length];
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(15);
            sum += ints[i];
        }
        System.out.println(Arrays.toString(ints));
        return sum;
    }


}
