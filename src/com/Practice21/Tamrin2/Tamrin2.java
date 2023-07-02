package com.Practice21.Tamrin2;

public class Tamrin2
{
    public static class Spam implements Runnable
    {
        private final int [] times;
        private final String [] message;

        public Spam(int[] times, String[] message)
        {
            this.times = times;
            this.message = message;
        }

        @Override
        public void run()
        {
            for (int i = 0; i < times.length ; i++)
            {
                System.out.println(message[i]);
                try
                {
                    Thread.sleep(times[i]);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
