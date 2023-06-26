package Practice21.Prc2;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ByteArrayInputStream b = new ByteArrayInputStream(new byte[]{'\n'});
        int[] time = {1000,5000,6000,7000};
        String[] massage= {"a","b","c","d"};
        Spam spam = new Spam(time,massage);
        spam.starsSpam();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.setIn(b);
    }
    public static class Spam implements Runnable{
        private int[] time;
        private String[] massage;

        public Spam(int[] time, String[] massage) {
            this.time = time;
            this.massage = massage;
        }

        @Override
        public void run() {
            for (int i = 0; i <massage.length ; i++) {
                try {
                    Thread.sleep(time[i]);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                    throw new RuntimeException(e);
                }
                System.out.println(massage[i]);
            }
        }
        public  void starsSpam(){
            Thread spam = new Thread(this);
            Thread listener = new Thread(new Listener(spam));
            spam.start();

            listener.setDaemon(true);
            listener.start();


        }
        public static class Listener implements Runnable{
            private Thread thread;



            public Listener(Thread thread) {
                this.thread = thread;
            }

            @Override
            public void run() {
                try {
                    if (System.in.available()>0 && System.in.read()=='\n'){

                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}

