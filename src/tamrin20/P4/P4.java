package tamrin20.P4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class P4 {
    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(2);

        Supplier<Double> mySupplier = (() -> {
            System.out.println(Thread.currentThread().getName());
            return Math.random();
        });

        var result = CompletableFuture.supplyAsync(mySupplier, myThreadPool);

        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException Occurred");
        } catch (ExecutionException e) {
            System.out.println("ExecutionException Occurred");
        } finally {
            myThreadPool.shutdown();
        }
    }
}
