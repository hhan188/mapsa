package SoheylSayyah.Practice21.Exercise1;

public class Task2 extends Thread
{
    @Override
    public void run()
    {
        super.run();
        for (int i = 0; i < 5 ; i++)
        {
            System.out.println(Thread.currentThread().getName());
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
