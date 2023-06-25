package SoheylSayyah.Practice21.Exercise1;

public class Task implements Runnable
{

    @Override
    public void run()
    {
        // ba fori mishe zad va kheyli sade tare!!
        int counter = 0;
        boolean resume = true;
        while (resume)
        {
            System.out.println(Thread.currentThread().getName());
            counter++;
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            if (counter >= 5){
                resume = false;
            }
        }
    }
}
