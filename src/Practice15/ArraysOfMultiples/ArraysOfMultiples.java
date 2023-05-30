package Practice15.ArraysOfMultiples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysOfMultiples {
    public static void main(String[] args){

arraysOfMultiples(7,5);
    }
    public static void arraysOfMultiples(int number, int length){
        ArrayList<Integer> multiple = new ArrayList<>();
        for (int i = 1; i <=length; i++) {
            multiple.add(i*number);
        }
        System.out.println(multiple);

    }
}
