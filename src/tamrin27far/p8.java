package tamrin27far;

import java.util.Scanner;

public class p8 {
    public static void main(String [] arg){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your word ;");
        String word = sc.nextLine();
        System.out.println(calculateSylab(word));
    }


    public static int calculateSylab(String word) {
        int i;
        int count = 1;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-' && word.charAt(i + 1) != '-') {
                count++;
            }
        }
        return count;


    }

}