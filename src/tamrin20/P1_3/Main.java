package tamrin20.P1_3;

public class Main {

    public static void main(String[] args) {

        Thread myThread = new Thread(()-> {
            while (!Thread.currentThread().isInterrupted()) {

                System.out.println("My name is: " + Thread.currentThread().getName());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    break;
                }
            }
        });

        myThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        myThread.interrupt();
    }
}
