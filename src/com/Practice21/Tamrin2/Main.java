package com.Practice21.Tamrin2;

public class Main
{
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        Tamrin2.Spam spamMessage = new Tamrin2.Spam(new int[]{1000, 2000, 1000, 4000, 1000}, new String[]{"a", "b", "c", "d", "e",});
        Thread spamThread = new Thread(spamMessage);

        spamThread.start();

        while ((end - start) <= 5000)
        {
            end = System.currentTimeMillis();
            if ((end - start) > 5000)
            {
                spamThread.interrupt();
                Thread.currentThread().interrupt();
            }
        }


        try
        {
            Thread.currentThread().join();
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
