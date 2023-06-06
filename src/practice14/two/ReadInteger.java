package practice14.two;

import java.util.Arrays;
import java.util.Scanner;

public class ReadInteger {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInteger() {
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        return n;
    }

    public static int[] readElements(int n) {
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}