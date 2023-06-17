package tamrin20.P1_2;

public class P1 extends Thread{


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
