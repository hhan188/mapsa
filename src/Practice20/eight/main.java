package Practice20.eight;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        var first=CompletableFuture.supplyAsync(()-> {
            try {
                 Thread.sleep(3000);
                return "first task is done.";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);}
        },executorService);
        System.out.println(first.get());
        var second=CompletableFuture.supplyAsync(()-> {
            try {
                 Thread.sleep(1000);
                return "second task is done.";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        },executorService);
        System.out.println(second.get());

        var last=CompletableFuture.allOf(first,second).thenRun(()->{
            System.out.println("all tasks are done.");
        });


    }
}
