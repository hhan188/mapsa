package practice15.nine;

import java.util.ArrayList;

public class Digits {
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number/=10;
            count++;
        }
        return count;
    }
}
