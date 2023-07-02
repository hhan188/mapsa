package com.Practice21.Tamrin1;

public class Thread1 implements Runnable
{

    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + "\n");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
