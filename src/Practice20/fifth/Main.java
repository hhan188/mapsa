package Practice20.fifth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//5 - Chain multiple CompletableFuture instances
// using thenRun, thenCompose, and thenCombine methods. For each CompletableFuture,
// use a custom ExecutorService to control the number of threads used for executing the tasks.
public class Main {
    public static void  main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);

        CompletableFuture<Object> firstName = CompletableFuture.supplyAsync(() -> "Mersede", threadPool);
        firstName.thenRun(() -> {
            try {
                System.out.println(firstName.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        var composeMethod=firstName.thenCompose((result)->CompletableFuture.supplyAsync(()->result+" sadeghi",threadPool));
        System.out.println(composeMethod.get());


        var iAm=CompletableFuture.supplyAsync(()->{ return "i am ";});

        var combineMethod=iAm.thenCombine(composeMethod,(first,second)-> {
            return first + second;});
        System.out.println(combineMethod.get());
    }



    }
