package tamrin27far;

import java.util.Scanner;

public class p5 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your string(word , number , ....):");
        String word = scanner.nextLine();
        int length = word.length();
        System.out.println("the length of string is : " + length);

    }
}
