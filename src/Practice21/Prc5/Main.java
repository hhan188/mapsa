package Practice21.Prc5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<String> color = CompletableFuture.supplyAsync(
                () ->  "Red"
        );
        color.thenRun(()->
        {
            System.out.println("First color is : "+color.join());
        });
        CompletableFuture<String> colorTwo = CompletableFuture.supplyAsync(
                ()->"Blue"
        );
        colorTwo.thenRun(
                ()->{
                    System.out.println("Second color is : "+colorTwo.join());
                }
        );
        CompletableFuture<String> fullColor = color
                .thenCombine(colorTwo,(a,b)->"Full color is "+a+b);
        System.out.println("Full color is : "+ fullColor.join());
    }

}
