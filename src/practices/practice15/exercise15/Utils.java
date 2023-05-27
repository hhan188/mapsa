package practices.practice15.exercise15;

import java.util.Arrays;

public class Utils {

    protected static int totalVolume(int[][] numbers) {
        int length = numbers.length;
        int width = numbers[0].length;
        int sum = 0;
        int multi = 1;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
//                System.out.println(numbers[i][j]);
                System.out.println("i: "+i);
                System.out.println("j: "+j);
                System.out.println(multi);
                if (i / length == 0) {
                multi*=numbers[i][j];

                }
            }
        }
            return 0;
    }
}
