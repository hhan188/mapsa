package SoheylSayyah.Practice21.Exercise11;

import java.util.concurrent.*;

public class Main
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<String> completableFuture1 = CompletableFuture
                .supplyAsync(() -> "Soheyl",executorService).orTimeout(5, TimeUnit.SECONDS);
        CompletableFuture<String> completableFuture2 = CompletableFuture.completedFuture("Sayyah")
                .completeOnTimeout("Finished",3,TimeUnit.SECONDS);
        System.out.println(completableFuture1.get());
        executorService.shutdown();
    }
}
