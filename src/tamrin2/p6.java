package tamrin2;

import java.util.Scanner;

public class p6 {

    public static void main(String[] args) {
        System.out.println("Return a String as an integer");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("Type \"quit\" to exit");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String input;
        int n;

        while (true) {
            System.out.print("Enter a positive integer: ");
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;
            n = stringInt(input);
            if (n <= 0){
                System.err.println("Enter valid integer > 0 for n");
                continue;
            }
            System.out.println("stringInt(" + input + ") -> " + n);
        }
    }

    private static int stringInt(String input){
        int n;
        try {
            n = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.err.println("Enter valid integer > 0 for n");
            return -1;
        }
        return n;
    }

}
