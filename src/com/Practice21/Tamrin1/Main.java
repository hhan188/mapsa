package com.Practice21.Tamrin1;

public class Main
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        Thread t3 = new Thread(() ->
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
        });

        MyRunnable myRunnable = new MyRunnable();
        Thread t4 = new Thread(myRunnable);

        t1.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
