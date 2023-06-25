package SoheylSayyah.Practice21.Exercise4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletableFuture <String> completableFuture = CompletableFuture.supplyAsync(() ->
                "Thread Name is " + Thread.currentThread().getName(), executor);
        System.out.println(completableFuture.get());
    }
}
