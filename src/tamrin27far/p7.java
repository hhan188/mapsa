package tamrin27far;

import java.util.Scanner;

public class p7 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your words : ");
        String word = scanner.nextLine();
        String word2 = scanner.nextLine();

        boolean result = word.equalsIgnoreCase(word2);
        System.out.println(word + " and " + word2 + ": " + result);

    }
}