package tamrin20.P8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class P8 {

    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(2);

        var CF1 = CompletableFuture.runAsync(() -> {
            //simulate long service response
            simulateLongTask();
            System.out.println("CompletableFuture 1 Completed");
        }, myThreadPool);

        var CF2 = CompletableFuture.runAsync(() -> System.out.println("CompletableFuture 2 Completed"), myThreadPool);

        CompletableFuture.allOf(CF1, CF2)
                .thenRun(() -> System.out.println("All tasks are completed"))
                .join();

        myThreadPool.shutdown();
    }

    public static void simulateLongTask() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
