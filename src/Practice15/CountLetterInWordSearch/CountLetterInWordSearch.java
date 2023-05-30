package Practice15.CountLetterInWordSearch;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CountLetterInWordSearch {
    public static void main(String[] args) {
        String[][] strings = new String[][]
                {
                        {"D", "E", "Y", "H", "A", "D"},
                        {"C", "B", "Z", "Y", "J", "K"},
                        {"D", "B", "C", "M", "N", "A"},
                        {"F", "G", "G", "R", "S", "R"},
                        {"V", "X", "H", "A", "S", "S"},

                };
        int counter = 0;
        for (int i = 0; i < 5; i++) {


            for (int j = 0; j < 6; j++) {
                if (strings[i][j]=="D"){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
