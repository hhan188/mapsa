package com.Practice21.Tamrin8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin8
{
    public static void t8()
    {
        try (ExecutorService executorService1 = Executors.newFixedThreadPool(2);
             ExecutorService executorService2 = Executors.newFixedThreadPool(3))
        {

            CompletableFuture<Void> future1 = CompletableFuture.runAsync(() ->
                    System.out.println("Task 1 on thread " + Thread.currentThread().getName()), executorService1);

            CompletableFuture<Void> future2 = CompletableFuture.runAsync(() ->
                    System.out.println("Task 2 running on thread " + Thread.currentThread().getName()), executorService1);

            CompletableFuture<Void> future3 = CompletableFuture.runAsync(() ->
                    System.out.println("Task 3 on thread " + Thread.currentThread().getName()), executorService2);

            CompletableFuture<Void> future4 = CompletableFuture.runAsync(() ->
                    System.out.println("Task 4 on thread " + Thread.currentThread().getName()), executorService2);

            CompletableFuture<Void> future5 = CompletableFuture.runAsync(() ->
                    System.out.println("Task 5 running on thread " + Thread.currentThread().getName()), executorService2);

            CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3, future4, future5);

            CompletableFuture<Void> finalFuture = combinedFuture.thenRun(() ->
                    System.out.println("All tasks completed on thread " + Thread.currentThread().getName()));

            finalFuture.join();
        }
    }
}
