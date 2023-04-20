package tamrin7.p7;

import java.util.Arrays;

//Problem 7
public class Main {
    public static void main(String[] args) {

        int[] fifteenInt = new int[15];

        for (int i = 0; i < fifteenInt.length; i++) {
            fifteenInt[i] = (int)(Math.random() * 10000);
        }

        System.out.println("The random array generated is: ");
        System.out.println(Arrays.toString(fifteenInt));

        int temp;
        for (int i = 0; i < fifteenInt.length; i++) {
            for (int j = i + 1; j < fifteenInt.length ; j++) {
                if (fifteenInt[j] < fifteenInt[i]){
                    temp = fifteenInt[j];
                    fifteenInt[j] = fifteenInt[i];
                    fifteenInt[i] = temp;
                }
            }
        }

        System.out.println("The sorted array is: ");
        System.out.println(Arrays.toString(fifteenInt));
    }
}
