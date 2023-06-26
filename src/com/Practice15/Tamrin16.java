package com.Practice15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tamrin16
{
    public static void reorderDigits (int [] numbers, String order)
    {
        List <Integer> nums = new ArrayList<>();
        ArrayList <Integer> temp = new ArrayList<>();
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < numbers.length; i++)
        {
            while (numbers[i] > 0)
            {
                temp.add(numbers[i] % 10);
                numbers[i] /= 10;
            }
            if (order.equalsIgnoreCase("asc"))
            {
                temp.sort((Integer::compareTo));  //Ascending Order
                temp.forEach(x::append);
                nums.add(Integer.parseInt(String.valueOf(x)));
                x.setLength(0);  //For Clear x
            }
            else if (order.equalsIgnoreCase("desc"))
            {
                temp.sort((Comparator.reverseOrder()));  //Descending Order
                temp.forEach(x::append);
                nums.add(Integer.parseInt(String.valueOf(x)));
                x.setLength(0);
            }
            temp.clear();  //For Clear Temp

        }
        if (order.equalsIgnoreCase("asc"))
        {
            System.out.println("Ascending Order: " + nums);
        }

        else if (order.equalsIgnoreCase("desc"))
        {
            System.out.println("Descending Order: " + nums);
        }
    }
}
