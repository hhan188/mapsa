package com.Practice21.Tamrin3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        Tamrin3 demo = new Tamrin3(new int[4][100]);

        System.out.println("This is Main Thread");
        long start = System.currentTimeMillis();
        try (ExecutorService es = Executors.newFixedThreadPool(4))
        {
            CompletableFuture<Void> f1 = CompletableFuture.runAsync(() ->
            {
                FindMax col1 = new FindMax(demo.getMatrix()[0]);
                col1.run();
                //System.out.println("The Result of " + Thread.currentThread().getName() + " is: ");
            });

            CompletableFuture<Void> f2 = CompletableFuture.runAsync(() ->
            {
                FindMax col2 = new FindMax(demo.getMatrix()[1]);
                col2.run();
                //System.out.println("The Result of " + Thread.currentThread().getName() + " is: " + );
            });

            CompletableFuture<Void> f3 = CompletableFuture.runAsync(() ->
            {
                FindMax col3 = new FindMax(demo.getMatrix()[2]);
                col3.run();
                //System.out.println("The Result of " + Thread.currentThread().getName() + " is: " + );
            });

            CompletableFuture<Void> f4 = CompletableFuture.runAsync(() ->
            {
                FindMax col4 = new FindMax(demo.getMatrix()[3]);
                col4.run();
                //System.out.println("The Result of " + Thread.currentThread().getName() + " is: " + );
            });

            CompletableFuture<Void> finalF = CompletableFuture.allOf(f1, f2, f3, f4);

            finalF.join();
        }

        long end = System.currentTimeMillis();
        System.out.println("MultiThread Execution: " + (end - start) + "ms");


    }
}
