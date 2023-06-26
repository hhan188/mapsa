package com.Practice15;

public class Tamrin7
{
    public static void basicOperation (String x, String y, String op)
    {
        try
        {
            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);
            if (op.equalsIgnoreCase("add"))
            {
                System.out.println(a + " + " + b + " = " + (a+b));
            }
            else if (op.equalsIgnoreCase("subtract"))
            {
                System.out.println(a + " - " + b + " = " + (a-b));
            }
            else if (op.equalsIgnoreCase("multiple"))
            {
                System.out.println(a + " * " + b + " = " + (a*b));
            }
            else if (op.equalsIgnoreCase("divide"))
            {
                System.out.println(a + " / " + b + " = " + (a/b));
            }
            else
            {
                System.out.println("Wrong Operation!");
            }
        }
        catch (ArithmeticException e)
        {
            System.out.println(Integer.MIN_VALUE);
        }
        catch (NumberFormatException e)
        {
            System.out.println("You Entered Non-Numeric!");
        }

    }
}
