package practice9.Generics1.tamrine2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;
//method generic ba class generic modelesh fargh mikone
public class UsingMax {

    public static <T extends Comparable<T>>T max (T[] numbers){
        T max=numbers[0];
        for (int i = 1; i <numbers.length-1 ; i++) {
            if(max.compareTo(numbers[i])<0){
                max=numbers[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] integers={3,2,5,4,3,3};
        System.out.println(max(integers));
    }

    }

