package com.Practice21.Tamrin5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin5
{
    public static void t5()
    {
        try (ExecutorService executor1 = Executors.newFixedThreadPool(2);
             ExecutorService executor2 = Executors.newFixedThreadPool(2);
             ExecutorService executor3 = Executors.newFixedThreadPool(2))
        {
            CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() ->
            {
                System.out.println("Running task 1 on thread: " + Thread.currentThread().getName());
                return "Java";
            }, executor1);

            CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() ->
            {
                System.out.println("Running task 2 on thread: " + Thread.currentThread().getName());
                return "Language";
            }, executor2);

            CompletableFuture<Void> future3 = future1.thenCombineAsync(future2, (str1, str2) ->
            {
                System.out.println("Running task 3 on thread: " + Thread.currentThread().getName());
                return str1 + " " + str2;
            }, executor3).thenComposeAsync(str ->
            {
                System.out.println("Running task 4 on thread: " + Thread.currentThread().getName());
                return CompletableFuture.runAsync(() -> System.out.println(str + " from task 4"), executor3);
            }, executor3).thenRunAsync(() -> System.out.println("Done with all tasks"), executor3);

            future3.get();

        }
        catch (ExecutionException | InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}