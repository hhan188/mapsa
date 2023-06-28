package Practice20.seventh;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var firstResult=firstCom();
        CompletableFuture<String> result=CompletableFuture.supplyAsync(()-> {
            try {
                return "Sam is " + firstResult.get() +"." ;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(result.get());

    }

    public static CompletableFuture<Integer> firstCom() throws ExecutionException, InterruptedException {
        ExecutorService executors= Executors.newFixedThreadPool(2);
        CompletableFuture<Integer> age=CompletableFuture.supplyAsync(()->{return 12 ;},executors);
        return age;
    }
}
