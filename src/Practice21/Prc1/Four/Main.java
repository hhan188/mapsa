package Practice21.Prc1.Four;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(Main::run);
        thread.start();
    }

    private static void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

