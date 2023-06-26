package com.Practice15;

public class Tamrin15
{
    public static void totalVolume (int [][] numbers)
    {
        int multiple = 1;
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j < numbers[i].length; j++)
            {
                multiple *= numbers[i][j];
            }
            sum += multiple;
            multiple = 1;
        }

        System.out.println("Result: " + sum);
    }
}
