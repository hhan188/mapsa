package tamrin7.p9;

import java.util.Arrays;

//Problem 9
public class Main {
    public static void main(String[] args) {

        double[] firstArray = new double[7];
        double[] secondArray = new double[7];

        for (int i = 0; i < 7; i++) {
            firstArray[i] = Math.random() * 100;
            secondArray[i] = Math.random() * 100;
        }

        System.out.println("First random generated array:");
        System.out.println(Arrays.toString(firstArray));

        System.out.println("Second random generated array:");
        System.out.println(Arrays.toString(secondArray));

        System.out.println("Multiplication of corresponding elements:");
        for (int i = 0; i < 7 ; i++){
            System.out.println("Multiply[" + i + "]: " + (firstArray[i] * secondArray[i]));
        }


    }
}
