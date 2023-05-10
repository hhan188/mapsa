package SoheylSayyah.Practice11.Exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number :");
        int number;
        while (true){
            try {
                number = Integer.parseInt(scanner.nextLine());
                System.out.println("Your Number is : " + number);
            } catch (NumberFormatException e) {
                System.err.println("User Input Was Not a Number.");
                throw new RuntimeException(e);
            }
        }
    }
}
