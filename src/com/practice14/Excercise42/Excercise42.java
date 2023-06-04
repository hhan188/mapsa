package com.practice14.Excercise42;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excercise42
{
    private static List <Integer> elements = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static List <Integer> readElements(int size)
    {
        System.out.println("Enter Numbers: ");
        for (int i=0; i < size; i++)
        {
            elements.add(sc.nextInt());
        }
        return elements;
    }

    public static int findMin(List <Integer> value)
    {
        int min = value.get(0);
        for (int i = 1; i < value.size(); i++)
        {
            if (min > value.get(i))
            {
                min = value.get(i);
            }
        }
        return min;
    }
}
