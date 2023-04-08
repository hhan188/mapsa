package practices.practice7.exercise9;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] firstArray = {1.75, 4.15, 7.3, 9.2, 11.8, 12.54, 2.5};
        double[] secondArray = {4.9, 10.25, 3.14, 7.258, 71.6, 1.4, 6.3};
        System.out.println(Arrays.toString(MultipleCorresponding.correspondingMultiple(firstArray, secondArray)));
    }
}
