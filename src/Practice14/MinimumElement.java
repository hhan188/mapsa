package Practice14;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class MinimumElement {
    public static int readInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many element you want to input");
        return sc.nextInt();
    }

    public static int[] readElements() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[readInteger()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    public static int findMin(int[] ar) {
        int temp = ar[0];
        for (int item : ar)
            if (temp > item)
                temp = item;
        return temp;
    }

    public static void main(String[] args){
        System.out.println(findMin(readElements()));
    }
}
