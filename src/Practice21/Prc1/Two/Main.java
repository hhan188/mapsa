package Practice21.Prc1.Four.Two;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Task2());
        thread.start();

    }
}
