package practices.practice71.exercise10;


public class RemoveDuplicate {
    protected static int[] removeDuplicate(int[] firstArray) {

        int[] temp = new int[firstArray.length];
        int index = 0;
        for (int i = 0; i < index; i++) {
            if (firstArray[i] != firstArray[i + 1]) {
                temp[index++] = firstArray[i];
            }
        }
        return temp;

    }
}
