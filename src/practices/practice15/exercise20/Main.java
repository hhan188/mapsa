package practices.practice15.exercise20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static practices.practice15.exercise20.Utils.missingNum;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        List<Integer> list=new ArrayList<>(Arrays.asList(integers));
        System.out.println(missingNum(list));

        Integer[] integers1 = {7, 2, 3, 6, 5, 9, 1, 4, 8};
        List<Integer> list1=new ArrayList<>(Arrays.asList(integers1));
        System.out.println(missingNum(list1));

        Integer[] integers2 = {10, 5, 1, 2, 4, 6, 8, 3, 9};
        List<Integer> list2 =new ArrayList<>(Arrays.asList(integers2));
        System.out.println(missingNum(list2));
    }

}
