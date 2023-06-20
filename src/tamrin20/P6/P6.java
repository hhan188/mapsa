package tamrin20.P6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class P6 {

    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(2);

        var CF1 = CompletableFuture.supplyAsync(() -> {
            //simulate long service response
            simulateLongTask();
            return 1;
        }, myThreadPool);

        var CF2 = CompletableFuture.supplyAsync(() -> 1, myThreadPool);

        System.out.println("\n --- .anyOf Demo:");
        CompletableFuture.anyOf(CF1, CF2)
                .thenAccept(result ->
                {
                    System.out.println("Command .anyOf is done fast after shortest task is completed");
                    System.out.println("Result is:" + result);
                })
                .join();

        System.out.println("\n --- .allOf Demo:");
        CompletableFuture.allOf(CF1, CF2)
                .thenRun(() ->
                {
                    System.out.println("Command .allOf is done after all tasks are completed");
                    try {
                        System.out.println("Result is:" + CF1.get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                })
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
