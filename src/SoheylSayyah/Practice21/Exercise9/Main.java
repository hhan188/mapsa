package SoheylSayyah.Practice21.Exercise9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<String> completableFuture1 = CompletableFuture
                .supplyAsync(() -> "Soheyl" , executorService).exceptionally(throwable -> {new Exception();
                    return "Error";
                });
        completableFuture1.exceptionally(ex -> "Error");
        completableFuture1.exceptionally(Throwable::getLocalizedMessage);

        CompletableFuture<String> completableFuture2 = CompletableFuture
                .supplyAsync(() -> "Ali" , executorService).exceptionally(Throwable::getLocalizedMessage);

        executorService.shutdown();
        System.out.println(completableFuture1.join());
        System.out.println(completableFuture2.join());
    }
}
