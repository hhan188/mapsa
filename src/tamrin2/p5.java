package tamrin2;

import java.util.Scanner;

public class p5 {

    public static void main(String[] args) {
        System.out.println("* * * Length of a String * * *");
        System.out.println("Enter an String and get it's length");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.nextLine();
        System.out.println("length(\"" + input + "\") -> " + getLength(input));
    }

    private static int getLength(String input) {
        return input.length();
    }
}
