package com.practise11.Tamrin0;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tamrin0
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true)
        {
            try
            {
                System.out.print("Enter a Integer Value: ");
                num = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.err.println("Entered Value is not Integer");
                break;
            }
        }
        sc.close();
    }
}
