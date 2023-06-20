package tamrin20.P9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class P9 {
    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(2);

        CompletableFuture<Double> future = CompletableFuture.supplyAsync(() -> {
            // some code that may throw an exception
            var randomNumber = Math.random();
            if (randomNumber < 0.5)
                return randomNumber;
            else
                throw new RuntimeException("Random number above 0.5: " + randomNumber);
        }, myThreadPool);

        Double output;

        System.out.println("\n ----- exceptionally demo:");
        try {
            output = future.exceptionally(ex -> {
                // handle exception and return a default value
                System.out.println("exceptionally method: Exception occurred, default value returned");
                return 0.0;
            }).get();
            System.out.println("result after get: " + output);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");
        }

        System.out.println("\n ----- handle demo:");
        try {
            output = future.handle((result, ex) -> {
                if (ex != null) {
                    // handle exception and return a default value
                    System.out.println("handle method: Exception occurred, default value returned");
                    return 0.0;
                } else {
                    // handle result and return a value
                    System.out.println("handle method: No exception, result value returned");
                    return result;
                }
            }).get();
            System.out.println("result after get: " + output);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        } catch (ExecutionException e) {
            System.out.println("ExecutionException");
        }

        System.out.println("\n ----- whenComplete demo:");
        future.whenComplete((result, ex) -> {
            if (ex != null) {
                // handle exception
                System.out.println("whenComplete method: Exception occurred, ex.getMessage: \n" + ex.getMessage());
            } else {
                // handle result
                System.out.println("whenComplete method: No exception, Result is: " + result);
            }
        });


        myThreadPool.shutdown();
    }
}
