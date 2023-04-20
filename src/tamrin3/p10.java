package tamrin3;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        System.out.println("* * * * Recreating the abs() function * * * *");

        double inputNumber;
        double absNumber;
        double[] output;

        while (true) {
            output = getNumber();
            if (output[1] == -1)
                break;
            inputNumber = output[0];
            absNumber = absolute(inputNumber);
            System.out.println("absolute(" + inputNumber + ") -> " + absNumber);
        }
    }

    private static double absolute(double inputNumber) {
        return inputNumber<0 ? -1*inputNumber: inputNumber;
    }

    private static double[] getNumber() {

        Scanner sc = new Scanner(System.in);
        String inputStr;
        double[] output = new double[2];

        while (true) {
            System.out.print("Enter a number (type 'quit' to exit): ");
            inputStr = sc.nextLine().trim().toLowerCase();
            //checking for "quit" user command
            if (inputStr.equals("quit")) {
                output[1] = -1;
                break;
            }
            //Ensure that user input is a valid integer number
            try {
                output[0] = Double.parseDouble(inputStr);
            } catch (NumberFormatException e) {
                System.err.println("Enter a valid double number");
                continue;
            }
            break;
        }
        return output;
    }

}