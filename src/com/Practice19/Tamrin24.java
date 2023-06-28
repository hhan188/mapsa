package com.Practice19;

public class Tamrin24
{

    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        long end = 0;
        Thread out = new Thread(() ->
        {
            while(!Thread.interrupted())
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("Background Thread Interrupted");
                }
            }
        });
        out.start();

        end = System.currentTimeMillis();

        while ((end - start) <= 2000)
        {
            end = System.currentTimeMillis();

            if ((end - start) >= 2000)
            {
                out.interrupt();
            }
        }
    }
}
