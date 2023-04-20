package tamrin3;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        System.out.println("* * * * Flip the Boolean * * * *");
        System.out.println("Type \"quit\" to exit");
        System.out.println();

        Scanner sc = new Scanner((System.in));
        String input;
        boolean boolValue;

        while (true){
            System.out.print("Enter a boolean value (T for True,F for False): ");
            input = sc.nextLine().trim().toLowerCase();
            if (input.equals("quit"))
                break;

            switch (input){
                case "t":
                    boolValue = true;
                    break;
                case "f":
                    boolValue = false;
                    break;
                default:
                    System.out.println("Not a valid input!");
                    continue;
            }

            System.out.println("reverse(" + boolValue + ") -> " + !boolValue);

        }
    }
}