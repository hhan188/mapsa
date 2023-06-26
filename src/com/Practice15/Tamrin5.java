package com.Practice15;

public class Tamrin5
{
    static int sum = 0;
    public static int recursiveSum (int [] x, int n)
    {

        if (n <= 0)
        {
            return 0;
        }
        else
        {
            return recursiveSum(x, n-1 ) + x[n-1];
        }

    }
}
