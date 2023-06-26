package com.Practice15;

import java.util.ArrayList;
import java.util.List;

public class Tamrin20
{
    public static void missingNum (List <Integer> numbers)
    {
        List <Integer> temp = new ArrayList<>(numbers.stream().sorted().toList());
        if (temp.size() < 10)
        {
            temp.add(11);
        }
        for (int i = 0; i < 10; i++)
        {
            if (temp.get(i) != (i+1))
            {
                System.out.println(i+1);
                break;
            }
        }
    }
}
