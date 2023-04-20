package tamrin2;

import java.util.Arrays;
import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {

        System.out.println("* * * * Pair Management * * * *");
        System.out.println("Enter two integer to make array");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println();

        System.out.println("Enter two integer number to make an array OR type \"quit\" to exit");

        Scanner sc = new Scanner(System.in);
        String input;
        int arg1;
        int arg2;
        int[] pair;

        while (true){
            System.out.print("Enter first number: ");
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;
            try {
                arg1 = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println();
                System.err.println("Enter valid integer pair");
                continue;
            }

            System.out.print("Enter second number: ");
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;
            try {
                arg2 = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println();
                System.err.println("Enter valid integer pair");
                continue;
            }

            pair = makePair(arg1,arg2);
            System.out.println("makePair(" + arg1 +"," + arg2 +") -> " + Arrays.toString(pair));

        }
    }

    private static int[] makePair(int arg1, int arg2) {

        return new int[]{arg1,arg2};

    }
}
