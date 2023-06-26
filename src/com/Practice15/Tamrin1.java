package com.Practice15;

import java.util.ArrayList;
import java.util.Arrays;

public class Tamrin1
{
    public static void arrayOfMultiple (int num, int length)
    {
        ArrayList <Integer> multipleArray = new ArrayList<>();

        for (int i=0; i < length; i++)
        {
            multipleArray.add(num * (i+1));
        }

        System.out.println(Arrays.toString(multipleArray.toArray()));
    }
}
