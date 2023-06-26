package com.Practice15;

public class Tamrin12
{
    public static void flipEndChar(String input)
    {
        char f = input.charAt(0);
        char l = input.charAt(input.length()-1);
        if (input.length() < 2)
        {
            System.out.println("Incompatible");
        }
        else if (f == l)
        {
            System.out.println("Two's a pair");
        }
        else
        {
            String result = l + input.substring(1,(input.length()-1)) + f;
            System.out.println(result);
        }
    }
}
