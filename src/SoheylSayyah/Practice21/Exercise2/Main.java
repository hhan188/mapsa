package SoheylSayyah.Practice21.Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // Create nested class Spam that receives an array of time intervals
    // in milliseconds and another connected array of messages.
    // So in case you have five time intervals - you should have five messages.
    // A spam object should print a message and sleep for the corresponding number of milliseconds,
    // connected from another array.
    // Spam object should stop doing any work in case the ‘Enter’ key has been pressed.
    // You can imitate ‘Enter’ key pressing by passing ‘\n’ character to the input stream of your program.
    // During the demo of this task, imitate enter key pressing after five seconds.
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<Integer> time = new ArrayList<>();
        time.add(1000);
        time.add(2000);
        time.add(3000);
        time.add(4000);
        time.add(5000);

        ArrayList<String> message = new ArrayList<>();
        message.add("A");
        message.add("B");
        message.add("C");
        message.add("D");
        message.add("E");

        Thread thread1 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            if (string.equals("\n")){
                Thread.currentThread().interrupt();
            }
        });
        Spam spam = new Spam(time,message);
        thread1.start();
        thread1.join();
        spam.run();
    }
    public static class Spam implements Runnable
    {
        private final ArrayList<Integer> time;
        private final ArrayList<String> message;
        public Spam(ArrayList<Integer> time, ArrayList<String> message) {
            this.time = time;
            this.message = message;
        }
        @Override
        public void run()
        {
            for (int i = 0; i < message.size() ; i++)
            {
                if (message.get(i).equals("\n")){
                    Thread.currentThread().interrupt();
                }
                try
                {
                    Thread.sleep(time.get(i));
                }
                catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
                System.out.println(message.get(i));
            }
        }
    }
}
