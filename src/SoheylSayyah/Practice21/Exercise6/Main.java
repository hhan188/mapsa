package SoheylSayyah.Practice21.Exercise6;

import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ArrayList<CompletableFuture<String>> arrayList = new ArrayList<>();
        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> "Soheyl" , executorService);
        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> "Sayyah" , executorService);

        arrayList.add(completableFuture1);
        arrayList.add(completableFuture2);
        System.out.println(arrayList);




    }
}
