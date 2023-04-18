package practices.practice71.exercise8;

import java.util.Arrays;

public class AddCorresponding {
    protected static int[] correspondingAdd(int[] firstArray, int[] secondArray) {
        int[] addArray = new int[Math.min(firstArray.length, secondArray.length)];
        for (int i = 0; i < addArray.length; i++) {
            addArray[i] = firstArray[i] + secondArray[i];
        }
        System.out.println("first array: "+ Arrays.toString(firstArray));
        System.out.println("second array: "+ Arrays.toString(secondArray));
        System.out.print("addArray: ");
        return addArray;
    }
}
