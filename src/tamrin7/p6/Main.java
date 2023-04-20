package tamrin7.p6;

import java.util.Arrays;

//problem 6
public class Main {
    public static void main(String[] args) {
        double[] twelveDoubles = new double[12];

        for (int i = 0; i < twelveDoubles.length; i++) {
            twelveDoubles[i] = 1000 * Math.random();
        }

        System.out.println("The random array generated is: ");
        System.out.println(Arrays.toString(twelveDoubles));

        byte smallestElementIndex = 0;

        for (byte i = 1; i < twelveDoubles.length; i++) {
            if (twelveDoubles[i] < twelveDoubles[smallestElementIndex])
                smallestElementIndex = i;
        }

        System.out.println("Smallest element index is: " + smallestElementIndex);
        System.out.println("Smallest element value is: " + twelveDoubles[smallestElementIndex]);
    }
}
