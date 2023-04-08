package practices.practice7.exercise9;

import java.util.Arrays;

public class MultipleCorresponding {
    protected static double[] correspondingMultiple(double[] firstArray, double[] secondArray) {
        double[] multipleArray = new double[Math.min(firstArray.length, secondArray.length)];
        for (int i = 0; i < multipleArray.length; i++) {
            multipleArray[i] = firstArray[i] * secondArray[i];
        }
        System.out.println("First Array: " + Arrays.toString(firstArray));
        System.out.println("Second Array: " + Arrays.toString(secondArray));
        System.out.print("Multiple Array: ");
        return multipleArray;
    }
}
