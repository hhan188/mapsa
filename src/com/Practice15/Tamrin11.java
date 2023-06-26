package com.Practice15;

public class Tamrin11
{
    public static void isPerfect (int num)
    {
        int x = 0;
        for (int i = 1; i < num / 2; i++)
        {
            if(num % i == 0)
            {
                x += i;
            }
        }

        System.out.println(x == (num / 2));
    }
}