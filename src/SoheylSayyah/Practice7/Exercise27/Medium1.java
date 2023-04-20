package SoheylSayyah.Practice7.Exercise27;

import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Your First Number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please Enter Your Second Number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please Enter Your Third Number : ");
        int thirdNumber = scanner.nextInt();
        int check = firstNumber > secondNumber ? firstNumber : secondNumber > thirdNumber ? secondNumber : thirdNumber;
        System.out.println("Biggest Number is : " + check);
    }
}
