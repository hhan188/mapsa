package com.Practice21.Tamrin9;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tamrin9
{

    public static void t9()
    {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() ->
        {
            throw new RuntimeException("Exception occurred in task 1");
        }, executorService);

        CompletableFuture<Integer> future2 = future1.exceptionally(ex ->
        {
            System.out.println("Exception occurred: " + ex.getMessage());
            return 0; // Return a default value
        });

        CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(() ->
        {
            return 10 / 0; // Divide by zero to throw an exception
        }, executorService).handle((result, ex) ->
        {
            if (ex != null)
            {
                System.out.println("Exception occurred: " + ex.getMessage());
                return 0; // Return a default value
            }
            else
            {
                return result * 2; // Return the result multiplied by 2
            }
        });

        CompletableFuture<String> future4 = CompletableFuture.supplyAsync(() -> "Task 4", executorService)
                .whenComplete((result, ex) ->
                {
                    if (ex != null)
                    {
                        System.out.println("Exception occurred: " + ex.getMessage());
                    }
                    else
                    {
                        System.out.println("Result of task 4: " + result);
                    }
                });

        CompletableFuture.allOf(future2, future3, future4).join();

        executorService.shutdown();
    }
}
