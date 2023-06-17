package tamrin20.P1_4;

public class Main {

    public static void main(String[] args) {

        Thread myThread = new Thread(Main::run);

        myThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread.interrupt();
    }

    private static void run() {
        while (!Thread.currentThread().isInterrupted()) {

            System.out.println("My name is: " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
