package tamrin7.p11;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] intArray = new int[25];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++){
            if (intArray[i] == 10){
                System.out.println("The first occurrence of 10 is at index " + i);
                break;
            }
        }
    }
}
