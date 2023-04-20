package tamrin3;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        System.out.println("* * * * Return Negative * * * *");

        int inputNumber;
        int negNumber;
        int[] output;

        while (true) {
            output = getInteger();
            if (output[1] == -1)
                break;
            inputNumber = output[0];
            negNumber = returnNegative(inputNumber);
            System.out.println("returnNegative(" + inputNumber + ") -> " + negNumber);
        }
    }

    private static int returnNegative(int inputNumber) {
        return inputNumber>=0 ? -1*inputNumber: inputNumber;
    }

    private static int[] getInteger() {

        Scanner sc = new Scanner(System.in);
        String inputStr;
        int[] output = new int[2];

        while (true) {
            System.out.print("Enter an integer (type 'quit' to exit): ");
            inputStr = sc.nextLine().trim().toLowerCase();
            //checking for "quit" user command
            if (inputStr.equals("quit")) {
                output[1] = -1;
                break;
            }
            //Ensure that user input is a valid integer number
            try {
                output[0] = Integer.parseInt(inputStr);
            } catch (NumberFormatException e) {
                System.err.println("Enter a valid integer number");
                continue;
            }
            break;
        }
        return output;
    }

}