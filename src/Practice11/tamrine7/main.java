package Practice11.tamrine7;

import java.io.FileReader;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;


public class main {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            try {
                System.out.println("please enter your number: ");
                int input = scanner.nextInt();
                if (input != 0) {
                    sum += input;
                } else {
                    System.out.println(sum);
                    break;
                }
            } catch (InputMismatchException e) {
               throw new NumberFormatException("Wrong number format");//chon ino serfan
                // throw karde va jayi tooye main catch nashode in payamo mide

            }
        }
    }
}



