package com.Practice21.Tamrin7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin7
{
    public static void t7()
    {
        try (ExecutorService executor = Executors.newFixedThreadPool(2);)
        {
            CompletableFuture<String> future = CompletableFuture.completedFuture("Hello, world!");

            CompletableFuture<Void> future2 = future.thenRunAsync(() ->
                    System.out.println("Running task on thread: " + Thread.currentThread().getName()), executor);

            future2.get();

        }
        catch (ExecutionException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
