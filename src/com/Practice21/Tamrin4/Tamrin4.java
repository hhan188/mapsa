package com.Practice21.Tamrin4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin4
{
    public static void t4 ()
    {
        try (ExecutorService es = Executors.newFixedThreadPool(2))
        {
            CompletableFuture <Integer> stringFuture = CompletableFuture.supplyAsync(() ->
            {
                System.out.println("Running task on thread: " + Thread.currentThread().getName());
                return (int) (Math.random() * 100) * 200;
            }, es);

            System.out.println("Result: " + stringFuture.get());
        }
        catch (ExecutionException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
