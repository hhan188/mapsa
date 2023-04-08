package practices.practice7.exercise11;

import java.util.Arrays;

public class FindNumber {
    protected static int finNumber(int searchNumber, int[] array) {
        int find = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                find = i;
                break;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        if (find == -1) {
            System.out.println("the number '" + searchNumber + "' is not exist of this array");
        } else System.out.print("the first index of '" + searchNumber + "' is: ");
        return find;
    }

}
