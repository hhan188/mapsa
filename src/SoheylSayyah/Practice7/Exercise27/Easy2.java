package SoheylSayyah.Practice7.Exercise27;

import java.util.Scanner;

public class Easy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your First Number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please Enter Your Second Number : ");
        int secondNumber = scanner.nextInt();
        String check = secondNumber > firstNumber ? "Minimum Number is : " + firstNumber : "Minimum Number is : " + secondNumber;
        System.out.println(check);
    }
}
