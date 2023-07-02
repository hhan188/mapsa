package com.Practice21.Tamrin6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin6
{
        public static void t6 ()
        {
            try ( ExecutorService executor1 = Executors.newFixedThreadPool(2);
                  ExecutorService executor2 = Executors.newFixedThreadPool(2);
                  ExecutorService executor3 = Executors.newFixedThreadPool(2);)
            {
            CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Task 1 on thread: " + Thread.currentThread().getName());
                return "Hello";
            }, executor1);

            CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Task 2 on thread: " + Thread.currentThread().getName());
                return "world!";
            }, executor2);

            CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
                System.out.println("Task 3 on thread: " + Thread.currentThread().getName());
                return "Goodbye";
            }, executor3);

            CompletableFuture<Void> allFutures = CompletableFuture.allOf(future1, future2, future3);

            CompletableFuture<Object> anyFuture = CompletableFuture.anyOf(future1, future2, future3);

            allFutures.get();

            System.out.println("All futures completed");

            Object result = anyFuture.get();

            System.out.println("Result of any future: " + result);

        }
            catch (ExecutionException | InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
}
