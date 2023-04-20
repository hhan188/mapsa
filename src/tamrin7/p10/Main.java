package tamrin7.p10;

import java.util.Arrays;

//Problem 10
public class Main {
    public static void main(String[] args) {
        int[] twentyInt = new int[15];

        for (int i = 0; i < twentyInt.length; i++) {
            twentyInt[i] = (int) (Math.random() * 10);
        }

        System.out.println("The random int array generated is: ");
        System.out.println(Arrays.toString(twentyInt));

        System.out.println("All duplicates will convert to -1");

        for (int i = 0; i < twentyInt.length; i++) {
            for (int j = i + 1; j < twentyInt.length; j++) {
                if (twentyInt[j] != -1 && (twentyInt[i] == twentyInt[j]))
                    twentyInt[j] = -1;
            }
        }
        System.out.println("The result array is: ");
        System.out.println(Arrays.toString(twentyInt));
    }
}
