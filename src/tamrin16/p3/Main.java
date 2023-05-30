package tamrin16.p3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] test = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(filterEvenNumbers(test)));

    }

    public static int[] filterEvenNumbers(int[] input){

        int[] output = new int[input.length];
        int counter = 0;
        EvenNumberPredicate enp = new EvenNumberPredicate();

        for (int i = 0; i < input.length; i++) {
            if (enp.test(input[i])){
                output[counter] = input[i];
                counter++;
            }
        }

        return output;
    }
}
