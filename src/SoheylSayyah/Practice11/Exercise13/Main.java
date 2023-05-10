package SoheylSayyah.Practice11.Exercise13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Please Enter Your Number :");
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNextInt()){
                sum += scanner.nextInt();
            }
            System.out.println("Sum of Your Numbers is : " + sum);
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("Your Input Was Not a Number");
        }
    }
}
