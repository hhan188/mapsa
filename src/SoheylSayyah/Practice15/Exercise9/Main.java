package SoheylSayyah.Practice15.Exercise9;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter a Number :");
        double number = scanner.nextDouble();
        int length = (int) Math.log10(number) + 1;
        if (number == 0){
            System.out.println("------------------------------------");
            System.out.println("There is Just 1 Digit in This Number");
        }else
        {
            System.out.println("------------------------------------");
            System.out.println("There are " + length + " Digits in This Number");
        }
    }
}
