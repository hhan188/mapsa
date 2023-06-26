package com.Practice15;

import java.util.Arrays;

public class Tamrin3
{
    public static void perfectSquare (int n)
    {
        if (n >= 1)
        {
            int [][] m = new int [n][n];
            for (int i=0; i < m.length; i++)
            {
                for (int j=0; j < m.length; j++)
                {
                    m[i][j] = n;
                }
            }

            for (int i = 0; i < m.length; i++) {
                System.out.println(Arrays.toString(m[i]));
            }
        }
        else if (n == 0)
        {
            System.out.println(Arrays.toString(new int[0]));
        }
    }

}
