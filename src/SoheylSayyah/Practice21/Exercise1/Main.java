package SoheylSayyah.Practice21.Exercise1;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread runnableThread = new Thread(new Task());
        runnableThread.start();
        //----------------------------------------------
        Thread classTask2 = new Thread(new Task2());
        classTask2.start();
        //----------------------------------------------
        Thread lambdaThread = new Thread(() ->
        {
            for (int i = 0; i < 5; i++)
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
        });
        lambdaThread.start();
        //----------------------------------------------
        Thread methodReference = new Thread(Main::run);
        methodReference.start();
    }
    private static void run()
    {
        for (int i = 0; i < 5; i++)
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
