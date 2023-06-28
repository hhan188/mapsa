package Practice20.sixth;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executors= Executors.newFixedThreadPool(2);

        var first=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "first task is being done.";},executors);

        var second=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            return "second task is being done.";},executors);

        var third=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "third task is being done.";},executors);


        CompletableFuture result=CompletableFuture.allOf(first,second,third).thenAccept(temp-> System.out.println("all tasks are done."));

      //  CompletableFuture result2=CompletableFuture.anyOf(first,second,third).thenAccept(temp-> System.out.println("result is: "+temp));


    }
}
