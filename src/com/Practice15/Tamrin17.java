package com.Practice15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Tamrin17
{
    public static void maxPoss (int x, int y)
    {
        String [] xNums = String.valueOf(x).split("");
        String [] yNums = String.valueOf(y).split("");
        List <Integer> xNumArray = new ArrayList<>(Arrays.stream(xNums).map(Integer::valueOf).toList());
        List <Integer> yNumArray = new ArrayList<>(Arrays.stream(yNums).map(Integer::valueOf).toList());
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < xNumArray.size(); i++)
        {
            if(yNumArray.isEmpty())
            {
                result.append(xNumArray.get(xNumArray.size() - 1));
                break;
            }

            if (xNumArray.get(i) > yNumArray.stream().max(Integer::compareTo).get())
            {
                result.append(xNumArray.get(i));
                //break;
            }
            else
            {
                result.append(yNumArray.stream().max(Integer::compareTo).orElse(0));
                yNumArray.remove((IntStream.range(0, yNumArray.size())
                        .filter(n -> Objects.equals(yNumArray.get(n), yNumArray.stream().max(Integer::compareTo).get()))
                        .findFirst()
                        .orElse(-1)));      //Finds max index and removes
            }
        }

        System.out.println(result);
    }
}
