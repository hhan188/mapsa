package SoheylSayyah.Practice21.Exercise5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main
{
    //Chain multiple CompletableFuture instances using thenRun,
    // thenCompose,and thenCombine methods.
    // For each CompletableFuture,
    // use a custom ExecutorService to control the number
    // of threads used for executing the tasks.
    public static void main(String[] args) throws ExecutionException, InterruptedException
    {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        CompletableFuture<String> firstName = CompletableFuture.supplyAsync(() -> "Soheyl");
        firstName.thenRun(() -> {
            try
            {
                System.out.println("First Name is : " + firstName.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<String> lastName = CompletableFuture.completedFuture("Sayyah");
        lastName.thenRun(() -> {
            try
            {
                System.out.println("Last Name is : " + lastName.get());
            }
            catch (InterruptedException | ExecutionException e)
            {
                throw new RuntimeException(e);
            }
        });
        CompletableFuture<String> fullName = firstName
                .thenCombine(lastName , (a , b) -> "Full Name is : " + a + " " + b);

        System.out.println(fullName.get());

        CompletableFuture<String> id = CompletableFuture.supplyAsync(() -> "20821646")
                .thenCompose(a -> CompletableFuture.supplyAsync(() -> "00" + a));

        CompletableFuture<String> fullNameWithId = fullName
                .thenCombine(id , (name , idNumber) -> name + " With Id Number : " + idNumber);

        System.out.println(fullNameWithId.get());
        executorService.shutdown();
    }
}
