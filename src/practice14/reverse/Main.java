package practice14.reverse;

import static practice14.reverse.Reverse.PrintOriginalArray;
import static practice14.reverse.Reverse.reverse;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7};
        PrintOriginalArray(arr);
        System.out.println("-----------");
        reverse(arr);

    }
}
