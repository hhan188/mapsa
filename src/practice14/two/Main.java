package practice14.two;

import static practice14.two.ReadInteger.*;

public class Main {
    public static void main(String[] args) {
        int n = readInteger();
        int[] arr = readElements(n);
        int min = findMin(arr);
        System.out.println("The minimum element is: " + min);

    }
}
