package com.practice14.Excercise41;

import java.util.*;

public class Excercise41
{
    private static List<Integer> integers = new ArrayList<>();

    public static List <Integer> getNumbers (int arrSize)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        for (int i=0; i<arrSize; i++)
        {
            integers.add(sc.nextInt());
        }

        return integers;
    }

    public static void printArray ()
    {
        for (int i = 0; i < integers.size(); i++)
        {

        }
        System.out.println(Arrays.toString(integers.toArray()));
    }

    public static void sortIntegers ()
    {
        Collections.sort(integers, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o2.compareTo(o1);
            }
        });

        System.out.println(Arrays.toString(integers.toArray()));

    }
}
