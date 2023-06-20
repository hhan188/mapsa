package tamrin20.P11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P11_orTimeout {
    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(1);

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Some long-running task
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
            return "Result";
        }, myThreadPool);

        future.orTimeout(2, TimeUnit.SECONDS)
                .exceptionally(ex -> {
                    System.out.println("Timeout occurred: " + ex.getMessage());
                    return null; // Return default value or handle the error
                })
                .thenAccept(result -> System.out.println("Result: " + result));

        myThreadPool.shutdown();
    }
}
