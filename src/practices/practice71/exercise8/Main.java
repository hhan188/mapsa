package practices.practice71.exercise8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 4, 7, 9, 11};
        int[] secondArray = {4, 10, 3, 7, 71, 1, 6};
        System.out.println(Arrays.toString(AddCorresponding.correspondingAdd(firstArray, secondArray)));
    }
}
