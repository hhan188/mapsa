package tamrin20.P1_2;

public class Main {

    public static void main(String[] args) {

        Thread myThread = new P1();

        myThread.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread.interrupt();
    }
}
