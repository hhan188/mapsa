package com.Practice15;

public class Tamrin2
{
    public static void warOfNumbers (int [] numbers)
    {
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int number : numbers)
        {
            if (number % 2 == 0)
            {
                sumOfEven += number;
            }
            else
            {
                sumOfOdd += number;
            }
        }
        System.out.println(Math.abs(sumOfEven - sumOfOdd));
    }
}
