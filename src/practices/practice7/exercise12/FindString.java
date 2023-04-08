package practices.practice7.exercise12;

import java.util.Arrays;

public class FindString {
    protected static int finString(String searchWord, String[] array) {
        int find = -1;
        for (int i = 0; i < array.length; i++) {
            if (searchWord.equals(array[i])) {
                find = i;
                break;
            }
        }
        System.out.println("Array: " + Arrays.toString(array));
        if (find == -1) {
            System.out.println("the word '" + searchWord + "' is not exist of this array");
        } else System.out.print("the first index of '" + searchWord + "' is: ");
        return find;
    }
}
