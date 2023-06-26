package com.practice11.Tamrin1;

import java.util.Scanner;

public class Tamrin1
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
                num = Integer.parseInt(sc.nextLine());
            }
            catch (NumberFormatException e)
            {
                System.err.println("Entered Value is not Integer");
                break;
            }
        }
        sc.close();
    }
}
