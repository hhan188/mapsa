package Practice21.Prc7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        CompletableFuture<String > name = CompletableFuture.completedFuture("Ehsan shademani");


        try {
            System.out.println("Name is : "+name.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        CompletableFuture<String> idNumber = CompletableFuture.completedFuture("12352414");

        try {
            System.out.println("Id number is : "+ idNumber.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        CompletableFuture<String> fullInformation = name
                .thenCombine(idNumber,(a,b)->"Thefull Information is : "+a+" whit id card number "+b);
        try {
            System.out.println( fullInformation.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }


}

