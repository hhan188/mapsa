package Practice15.eight;

import java.util.Map;

public class CountLettersInAWordSearch {
    public static void main(String[] args) {
        method("R");

    }
    public static void method(String target){
        String[][] arr = {
                {"A","B","C"},
                {"B", "G", "T"},
                {"R", "A", "S"}
        };
        int counter=0;
        for (int i=0; i < 3; i++) {
            for (int j=0; j <3; j++) {
                if (arr[i][j]==target){
                    counter++;
                }
            }
            }
        System.out.println(counter);

    }
}
