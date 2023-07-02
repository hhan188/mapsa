package com.Practice21.Tamrin10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin10
{
    public static void t10()
    {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() ->
        {
            System.out.println("Task 1 running on thread " + Thread.currentThread().getName());
        }, executorService);

        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() ->
        {
            System.out.println("Task 2 running on thread " + Thread.currentThread().getName());
            return 42;
        }, executorService);

        CompletableFuture.allOf(future1, future2).join();

        executorService.shutdown();
    }
}