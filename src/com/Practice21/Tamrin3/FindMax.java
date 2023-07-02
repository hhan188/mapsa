package com.Practice21.Tamrin3;

import java.util.concurrent.atomic.AtomicInteger;

public class FindMax implements Runnable
{
    private static AtomicInteger max = new AtomicInteger();

    private int [] column;

    public FindMax(int[] column)
    {
        this.column = column;
    }

    public static AtomicInteger getMax()
    {
        return max;
    }

    @Override
    public void run()
    {
            max.set(column[0]);

            for (int i = 1; i < column.length; i++)
            {
                try
                {
                    Thread.sleep(1);
                    if (max.get() < column[i])
                    {
                        max.set(column[i]);
                    }
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(max);
    }
}
