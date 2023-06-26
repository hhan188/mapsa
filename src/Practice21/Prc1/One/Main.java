package Practice21.Prc1.Four.One;

public class Main {
    public static void main(String[] args) {
        Thread threadRun=new Thread(new Thread(new Practice21.Prc1.Four.One.Task()));

        threadRun.start();

    }
}
