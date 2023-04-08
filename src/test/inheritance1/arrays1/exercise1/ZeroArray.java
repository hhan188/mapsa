package test.inheritance1.arrays1.exercise1;

import java.util.Arrays;

public class ZeroArray {
    protected static void print1(int length){
        int[] ints=new int[length];
        System.out.println(Arrays.toString(ints));
    }
    protected static void print2(int length){
        int[] ints=new int[length];
       for(int zero:ints){
           System.out.print(zero+" ");
       }
        System.out.println();
    }

    public static void print3(int length) {
    int[] ints=new int[length];
        for (int i = 0; i <length ; i++) {
            ints[i]=0;
        }
        System.out.println(Arrays.toString(ints));


    }
}
