package Practice14;

import java.util.Arrays;

public class ReverseArray {
    public static void reverse(int[] array){
        int len = array.length-1;
        int first = 0;
        int temp;
        while (len != array.length/2) {
            temp = array[len];
            array[len] = array[first];
            array[first] = temp;
            len--;
            first++;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
       reverse(new int[]{2, 4, 5, 6, 7});

    }
}
