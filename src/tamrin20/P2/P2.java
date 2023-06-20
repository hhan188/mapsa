package tamrin20.P2;

import java.util.Arrays;
import java.util.List;

public class P2 {
    public static void main(String[] args) {

        List<Integer> time = Arrays.asList(100, 200, 300, 400, 500);

        List<String> message = Arrays.asList("First", "Second", "Third", "Forth", "Fifth");

        Spam mySpam = new Spam(time, message);

        Thread myThread = new Thread(mySpam);
        myThread.start();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Spam implements Runnable {

        private List<Integer> time;
        private List<String> message;

        public Spam(List<Integer> time, List<String> message) {
            this.time = time;
            this.message = message;
        }

        @Override
        public void run() {
            for (int i = 0; i < message.size(); i++) {

                System.out.println(message.get(i));

                try {
                    Thread.sleep(time.get(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }
    }
}
