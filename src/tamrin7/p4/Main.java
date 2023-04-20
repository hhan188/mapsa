package tamrin7.p4;

import java.util.Arrays;
//Problem 4
public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[100];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(1000 * Math.random());
        }

        System.out.println(Arrays.toString(intArray));
    }
}
