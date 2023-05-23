package Prac14.P42;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("please enter size for numbers array");
        if (scanner.hasNextInt())
            number = scanner.nextInt();
        else
            System.err.println("please enter an valid integer");

        return number;
    }

    public static int[] readElement(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[size];
        for (int i = 0; i < elements.length; i++) {
            System.out.println("please enter value for index " + i);

            if (scanner.hasNextInt())
                elements[i] = scanner.nextInt();
            else
                System.err.println("please enter an valid integer");

        }
        return elements;
    }

    public static int findMin(int[] numbers) {
        return Arrays.stream(numbers).min().orElse(0);
    }
    public static void main(String[] args) {
        int size = readInteger();
        int[] numbers = readElement(size);
        System.out.println("minimum is " + findMin(numbers));
    }
}
