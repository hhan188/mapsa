package practices.practice14.exercise3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Integer[] getIntegers(int length) {
        Integer[] integers = new Integer[length];
        int count = 0;
        System.out.println("You Need To Input '" + length + "' Type Of Numbers");
        while (count < length) {
            System.out.print("Element " + count + " contents: ");
            Scanner scanner = new Scanner(System.in);
            integers[count++] = scanner.nextInt();
        }
        Arrays.sort(integers);
        Integer[] sortReverse = new Integer[length];
        for (int i = 0; i < length; i++) {
            sortReverse[i] = integers[length - 1 - i];
        }
        return sortReverse;
    }


    protected static void demo() {
        System.out.print("Please Enter The Length Of Array:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(getIntegers(scanner.nextInt())));
    }
}
