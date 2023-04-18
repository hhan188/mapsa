package practices.practice71.exercise7;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    protected static int[] sort(int length) {
        int[] ints = new int[length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(ints));
        int temp = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < i; j++) {
                if (ints[i] < ints[j]) {
                    temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        } return ints;
    }
}
