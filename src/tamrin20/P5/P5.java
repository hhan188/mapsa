package tamrin20.P5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class P5 {

    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(10);

        var myRunnableTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is myRunnableTask");
                System.out.println("Now myRunnableTask finished");
            }
        };

/*
        var myWaitTask = new Runnable() {
            @Override
            public void run() {
                System.out.println("To see the result, main should wait,");
                System.out.println("Waiting ...");
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("\nWaiting finished");

            }
        };
*/


        CompletableFuture.runAsync(myRunnableTask, myThreadPool)
                .thenRun(() -> System.out.println("Chaining thenRun Method ... END\n"));

        var CF1 = CompletableFuture.supplyAsync(P5::getRandom, myThreadPool)
                .thenComposeAsync(aDouble -> CompletableFuture.supplyAsync(() -> aDouble * 10), myThreadPool)
                .thenApplyAsync(bDouble -> {
                    System.out.println("Final CF1 (Compose output): " + bDouble);
                    return bDouble;
                }, myThreadPool);

        var CF2 = CompletableFuture.supplyAsync(P5::getRandom, myThreadPool)
                .thenComposeAsync(aDouble -> CompletableFuture.supplyAsync(() -> aDouble * 10), myThreadPool)
                .thenApplyAsync(bDouble -> {
                    System.out.println("Final CF2 (Compose output): " + bDouble);
                    return bDouble;
                }, myThreadPool);

        CF1.thenCombineAsync(CF2, Double::sum, myThreadPool)
                .thenAccept(cDouble -> System.out.println("Sum CF1 & CF2 (Combining results): " + cDouble));


//        CompletableFuture.runAsync(myWaitTask);

        myThreadPool.shutdown();
    }

    private static Double getRandom() {
        Double a = Math.random();
        System.out.println("Math.random output: " + a);
        return a;
    }
}
