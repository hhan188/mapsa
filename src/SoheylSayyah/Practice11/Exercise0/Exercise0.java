package SoheylSayyah.Practice11.Exercise0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number :");
        int number;
            while (true){
                try {
                    number = scanner.nextInt();
                    System.out.println("Your Number is a Valid Integer : " + number);
                } catch (InputMismatchException e) {
                    System.err.println("User Input Was Not Valid.");
                    break;
                }
            }
    }
}
