package Practice20.first;

public class MyThreadExtend extends Thread {


    //By extending Thread class

//    public MyThreadExtend() {
//    }
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//    }
//
     //By passing lambda function to the constructor of Thread class
//    public MyThreadExtend(Runnable task) {
//        super(task);
//    }


        public static void run2() {
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
