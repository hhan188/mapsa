package tamrin20.P10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class P10 {

    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(1);

        CompletableFuture.supplyAsync(Math::random, myThreadPool)
                .thenAccept(System.out::println);

        Runnable task = () -> System.out.println("Runnable task.");

        CompletableFuture.runAsync(task,myThreadPool);

        myThreadPool.shutdown();
    }
}
