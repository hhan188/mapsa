package tamrin11.p13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {

        int userInput = 0;
        int sum = 0;

        while (userInput != -1){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter integer value (-1 to exit): ");
                userInput = sc.nextInt();
                if (userInput != -1)
                    sum += userInput;
            } catch (InputMismatchException e) {
                System.out.println("Not an integer input");
            }
        }
        System.out.println("Sum is: " + sum);
    }

}
