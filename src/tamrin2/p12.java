package tamrin2;

import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        System.out.println("* * * * Repeat String * * * *");
        System.out.println("Enter a string and a number to repeat it that number of times");
        System.out.println("Type \"-1\" to exit");
        System.out.println();

        int rptNumber;
        int intCheck;
        String inputString;
        Scanner sc = new Scanner(System.in);

        while (true) {
            //getting string
            System.out.print("Enter your String (-1 to exit): ");
            inputString = sc.nextLine().trim();
            //checking user exit command
            if (inputString.equals("-1"))
                break;

            rptNumber = getInteger();

            try {
                intCheck = Integer.parseInt(inputString);
                System.out.println("repeatString(\"" + inputString + "\", " + rptNumber + ") -> " + "\"Not a String!\"");
                continue;

            } catch (NumberFormatException e) {
                //do nothing, It's OK
            }

            System.out.print("repeatString(\"" + inputString + "\", " + rptNumber + ") -> \"");
            System.out.println(inputString.repeat(rptNumber) + "\"");

        }
    }

    private static int getInteger() {

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int output;

        while (true) {
            System.out.print("Enter a positive integer: ");
            inputStr = sc.nextLine().trim().toLowerCase();
            //Ensure that user input is a valid integer number
            try {
                output = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.err.println("Enter a valid integer number");
                continue;
            }
            //Ensure that user input is a positive integer number
            if (output <= 0) {
                System.err.println("Enter a positive integer number");
                continue;
            }
            break;
        }
        return output;
    }
}