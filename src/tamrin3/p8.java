package tamrin3;

import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        System.out.println("* * * * Is the Empty String? * * * *");
        System.out.println("Type \"-1\" to exit");

        String input;
        boolean result;

        Scanner sc = new Scanner((System.in));

        while ((true)){
            System.out.print("Enter your string: ");
            input = sc.nextLine();
            if (input.equals("-1"))
                break;
            result = isEmpty(input);
            System.out.println("isEmpty(\"" + input + "\") -> " + result);
        }
    }

    private static boolean isEmpty(String input) {
        return input.isEmpty();
    }
}