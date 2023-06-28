package Practice20.first;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        By creating separate class that implements Runnable interface
//        MyThread myThread=new MyThread();
//        myThread.run();

//        MyThreadExtend myThreadExtend=new MyThreadExtend();
//        myThreadExtend.run();


         //By passing lambda function to the constructor of Thread class
//        MyThreadExtend myThreadExtend = new MyThreadExtend(() -> {
//            for (int i = 0; i < 5; i++) {
//                System.out.println(Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//
//            }
//        });
//        myThreadExtend.run();


        //By passing method reference to the constructor of Thread class
          Thread myThreadExtend=new Thread(MyThreadExtend::run2);
          myThreadExtend.start();



    }

}
