package tamrin11.p1;

import java.util.Scanner;

public class InputConversion {

    public static void main(String[] args) {

        int userInput = 0;
        try {
            userInput = readUserInput();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Stack Trace is: ");
            e.printStackTrace();
        }
    }

    public static int readUserInput() throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value: ");
        String inputString;
        inputString = sc.nextLine();
        int inputInteger;
        try {
            inputInteger = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Not an integer input");
        }
        return inputInteger;
    }
}