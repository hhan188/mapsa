package tamrin11.p7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class p07 {
    public static void main(String[] args) {

        int userInput = 0;
        int sum = 0;
        while (userInput != -1){
            try {
                userInput = readUserInput();
                if (userInput != -1)
                    sum += userInput;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Sum is: " + sum);
    }

    public static int readUserInput() throws NumberFormatException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer value (-1 to exit): ");
        int integerNumber;
        try {
            integerNumber = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new NumberFormatException("Not an integer input");
        }
        return integerNumber;
    }

}
