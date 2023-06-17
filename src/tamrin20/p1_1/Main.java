package tamrin20.p1_1;

public class Main {

    public static void main(String[] args) {
        P1 myRunnable = new P1();

        Thread myThread = new Thread(myRunnable);

        myThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread.interrupt();
    }
}
