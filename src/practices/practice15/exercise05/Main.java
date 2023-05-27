package practices.practice15.exercise05;

import static practices.practice15.exercise05.Sum.sumOfArraysElements;

public class Main {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4};
        System.out.println(sumOfArraysElements(integers));
        Integer[] integers1 = {1, 2};
        System.out.println(sumOfArraysElements(integers1));
        Integer[] integers2 = {1};
        System.out.println(sumOfArraysElements(integers2));
        Integer[] integers3 = {};
        System.out.println(sumOfArraysElements(integers3));

    }
}
