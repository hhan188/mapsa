package tamrin20.P13;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class P13 {
    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(3);

        var CF1 = CompletableFuture.supplyAsync(P13::getRandom, myThreadPool);

        var CF2 = CompletableFuture.supplyAsync(P13::getRandom, myThreadPool);

        CF1.thenCombineAsync(CF2, Double::sum, myThreadPool)
                .thenAcceptAsync(cDouble -> System.out.println("Sum CF1 & CF2 (Combining results): " + cDouble));

        myThreadPool.shutdown();
    }

    private static Double getRandom() {
        Double a = Math.random();
        System.out.println("Math.random output: " + a);
        return a;
    }
}
