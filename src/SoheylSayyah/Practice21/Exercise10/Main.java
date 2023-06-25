package SoheylSayyah.Practice21.Exercise10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            System.out.println("Soheyl");} , executorService);

        CompletableFuture<String> completableFuture2 = CompletableFuture
                .supplyAsync(() -> "Sayyah" , executorService);

        CompletableFuture<String> full = completableFuture1.thenCombine(completableFuture1 , (a , b) -> a + " " + b);
        System.out.println(full.get());

        completableFuture1.get();
        System.out.println(completableFuture2.get());
        executorService.shutdown();
    }
}
