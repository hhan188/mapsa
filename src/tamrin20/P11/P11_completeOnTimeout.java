package tamrin20.P11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class P11_completeOnTimeout {

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

        future.completeOnTimeout("Default Result", 2, TimeUnit.SECONDS)
                .thenAccept(result -> System.out.println("Result: " + result));

        myThreadPool.shutdown();
    }

}
