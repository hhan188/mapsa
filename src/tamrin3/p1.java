package tamrin3;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        System.out.println("* * * * Return Something to me! * * * *");
        System.out.println();

        String input;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your String (-1 to exit): ");
            input = sc.nextLine().trim();
            if (input.equals("-1"))
                break;
            giveMeSomething(input);
        }
    }

    private static void giveMeSomething(String input) {
        System.out.println("something " + input);
    }
}