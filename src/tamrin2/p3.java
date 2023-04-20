package tamrin2;

import java.util.Scanner;

public class p3 {

    public static void main (String[] args){
        System.out.println("* * * * Nth Even Number * * * *");
        System.out.println("Enter an integer number 'n' to get nth even number");
        System.out.println("Type \"quit\" to exit");
        System.out.println("* * * * * * * * * * * * * * * *");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String input;
        int n;
        int nth;

        while (true) {
            System.out.print("Enter an integer n: ");
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;
            try {
                n = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.err.println("Enter valid integer > 0 for n");
                continue;
            }
            if (n <= 0){
                System.err.println("Enter valid integer > 0 for n");
                continue;
            }

            nth = even(n);
            System.out.println("even(" + n + ") -> " + nth);
        }


    }

    private static int even(int n) {
        return 2 * (n-1);
    }
}
