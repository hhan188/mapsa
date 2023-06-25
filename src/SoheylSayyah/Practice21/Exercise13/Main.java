package SoheylSayyah.Practice21.Exercise13;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CompletableFuture<Integer> idCard = CompletableFuture.supplyAsync(() ->
                8748,executorService);
        CompletableFuture<String> name = CompletableFuture.supplyAsync(() ->
                "Soheyl Sayyah",executorService);

        CompletableFuture<String> fullSpecifications =  name
                .thenCombineAsync(idCard , (a , b) -> "Full Name + Id Number is : " + a + " " + b , executorService);

        System.out.println(fullSpecifications.join());
    }
}
