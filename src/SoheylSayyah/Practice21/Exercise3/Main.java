package SoheylSayyah.Practice21.Exercise3;

import java.util.concurrent.atomic.AtomicInteger;

public class Main
{
    // Create a method that can generate a multidimensional array M x N.
    // For the sake of the demo, generate an array with 4 rows and 100 columns.
    // Find the maximum integer with the help of multiple threads.
    // Comparison of each int should go with 1 milliseconds delay to imitate comparison of big objects.
    // This requirement is important in order you could see benefits of multithreading execution.
    // Don’t miss it because it will give you incorrect results.
    // Use the same block of code to find the maximum integer in one thread.
    // Do not forget about 1 milliseconds delay.
    // Measure the execution time for multithreading solution and single-thread solution.
    // You should see the advantage of a multithreading solution.
    // If you can’t see that multithreading solution solves this
    // task faster, most likely you wrote your program incorrectly.
    static volatile AtomicInteger max = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException
    {
        int row = 4;
        int column = 100;
        int[][] numbers = new int[row][column];
        for (int i = 0; i < row ; i++)
        {
            for (int j = 0; j < column ; j++)
            {
                numbers[i][j] = (int) (Math.random() * 1000);
            }
        }
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < column ; i++)
            {
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                if (max.get() < numbers[0][i]){
                    max.set(numbers[0][i]);
                }
            }
        });
        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < column ; i++)
            {
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                if (max.get() < numbers[1][i]){
                    max.set(numbers[1][i]);
                }
            }
        });
        Thread thread3 = new Thread(() ->{
            for (int i = 0; i < column ; i++)
            {
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                if (max.get() < numbers[2][i]){
                    max.set(numbers[2][i]);
                }
            }
        });
        Thread thread4 = new Thread(() ->{
            for (int i = 0; i < column ; i++)
            {
                try
                {
                    Thread.sleep(1);
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                if (max.get() < numbers[3][i]){
                    max.set(numbers[3][i]);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        System.out.println("Max Value is : " + max);
    }
}
