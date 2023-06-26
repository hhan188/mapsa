package com.practice11.Tamrin7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tamrin7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter Numbers: ");
        try
        {
            while (true)
            {
                int numbers = sc.nextInt();
                sum += numbers;
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Sum Of Numbers: " + sum);
            System.out.println("Your Last Value is Non-Numeric");
        }
    }
}
