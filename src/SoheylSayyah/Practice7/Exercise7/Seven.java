package SoheylSayyah.Practice7.Exercise7;

import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0 ; i < array.length ; i++){
            if (i % 2 == 0){
                array[i] = i;
            }else {
                array[i] = i * 2;
            }
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}