package com.practice11.Tamrin13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tamrin13
{
    public static void main(String[] args)
    {
        int sum = 0;
        System.out.println("Enter Numbers: ");
        try (Scanner sc = new Scanner(System.in))
        {
            int number;
            do
            {
                number = sc.nextInt();
                if (number < 0)
                    break;
                sum += number;

            } while (number > 0);

            System.out.println("Sum: " + sum);
        }
        catch (InputMismatchException e)
        {
            System.err.println("You Entered Non-Numeric Value");
            System.out.println("Sum: " + sum);
        }
    }
}
