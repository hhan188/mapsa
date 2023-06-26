package com.Practice15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tamrin14
{
    public static void stateName (String [] names, String filter)
    {
        List<String> result = new ArrayList<>();

        if (filter.equalsIgnoreCase("abb"))
        {
            result = Arrays.stream(names).filter(i -> i.length() == 2).toList();
        }
        else if (filter.equalsIgnoreCase("full"))
        {
            result = Arrays.stream(names).filter(i -> i.length() > 2).toList();
        }

        System.out.println(result);
    }
}
