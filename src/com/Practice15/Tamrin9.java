package com.Practice15;

public class Tamrin9
{
    public static void digitsCounter (int num)
    {
        int counter = 0;

        while (num > 0)
        {
            num /= 10;
            counter++;
        }

        System.out.println("Number of Digits: " + counter);
    }
}
