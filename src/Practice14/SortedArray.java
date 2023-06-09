package Practice14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedArray {

    static ArrayList<Integer> array = new ArrayList<>();

    public static void getIntegers(int a) {
        array.add(a);
    }

    public static void sortIntegers() {
        Collections.sort(array);
        Collections.reverse(array);
    }

    public static void printArray() {
        for (Integer item : array)
            System.out.println("Element :" + array.indexOf(item) + "  Content :" + item);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt())
            getIntegers(sc.nextInt());
        sortIntegers();
        printArray();
    }


}
