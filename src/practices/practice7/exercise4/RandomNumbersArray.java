package practices.practice7.exercise4;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersArray {
    protected static void print(int length) {
        int[] randomNumbers = new int[length];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = new Random().nextInt(998);
        }

        System.out.println(Arrays.toString(randomNumbers));
    }

}
