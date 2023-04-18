package practices.practice71.exercise10;

import java.util.Arrays;//not yet

public class RemoveDuplicate {
    protected static int[] removeDuplicate(int[] firstArray) {
//        int[] remove = new int[firstArray.length];

//        int[] remove = new int[firstArray.length];
        int index=0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (firstArray[i]==firstArray[j]){
                    index++;
                }
            }
        }
        int[] remove = new int[index];
        int index1=0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (firstArray[i]==firstArray[j]){
                    remove[index1++]=firstArray[i];
                }
            }
        }

//        for (int i = 0; i < firstArray.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (firstArray[i]!=firstArray[j]){
//                    remove[index++]=firstArray[i];
//                }
//            }
//        }
        System.out.println("original array: "+ Arrays.toString(firstArray));
        System.out.print("New Remove Duplicate: ");
        return remove;
    }
}
