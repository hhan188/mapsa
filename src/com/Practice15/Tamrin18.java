package com.Practice15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tamrin18
{
    public static void palindromeDescendant (long number)
    {
        String [] num = String.valueOf(number).split("");
        List<Integer> numsArray = new ArrayList<>(Arrays.stream(num).map(Integer::valueOf).toList());

        if (numsArray.size() == 2)
        {
            if (numsArray.get(0).equals(numsArray.get(1)))
            {
                System.out.println(true);
            }
        }
        else
        {
            System.out.println(numsArray.stream().reduce(Integer::sum).get());
        }
    }
}
