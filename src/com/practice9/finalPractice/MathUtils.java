package com.practice9.finalPractice;

public final class MathUtils
{
    public static int factorial (int num)
    {
        int fact = 1;
        for (int i=1; i<= num; i++)
        {
            fact *= i;
        }
        return fact;
    }

    public static boolean isPrime (int num)
    {
        byte counter = 0;

        if (num % 2 == 0)
        {
            return false;
        }
        else
        {
            for (int i = 3; i < num / 2; i++)
            {
                if (num % i == 0)
                {
                    counter++;
                }
            }
        }

        if (counter == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
