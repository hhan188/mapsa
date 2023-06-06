package practice15.eight;

import java.util.ArrayList;

public class CountLetters {
    public static int countLetter(ArrayList<String> arr1,ArrayList<String> arr2,ArrayList<String> arr3,String st){
        int count=0;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i).equals(st)){
                count++;
            }
        }
        for (int i = 0; i < arr2.size(); i++) {
            if (arr1.get(i).equals(st)){
                count++;
            }
        }
        for (int i = 0; i < arr3.size(); i++) {
            if (arr1.get(i).equals(st)){
                count++;
            }
        }return count;
    }
}
