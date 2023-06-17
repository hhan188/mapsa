package tamrin20.p1_1;

public class P1 implements Runnable{


    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){

            System.out.println("My name is: "+Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
