package Prac14.P43;

import java.util.Arrays;

public class Main {
    private static void reverse(int[] numbers) {
        int j = numbers.length - 1;
        System.out.println("original array is " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
            j--;
        }
        System.out.println("reversed array is " + Arrays.toString(numbers));
    }
    public static void main(String[] args) {
        reverse(new int[] {1, 2, 3, 4, 5});
        reverse(new int[] {99, 33});
        reverse(new int[] {67, 23, 88, 75, 12, 100});
    }
}
