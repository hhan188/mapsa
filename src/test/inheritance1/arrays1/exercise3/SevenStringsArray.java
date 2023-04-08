package test.inheritance1.arrays1.exercise3;

import java.util.Arrays;

public class SevenStringsArray {
    public static void print(int length) {
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            strings[i] = "";
        }
        System.out.println(Arrays.toString(strings));
    }
}

