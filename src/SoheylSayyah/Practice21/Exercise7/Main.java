package SoheylSayyah.Practice21.Exercise7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("This is The Answer");
        executorService.shutdown();
        System.out.println(completableFuture.join());
        System.out.println(completableFuture.get());
//        Differences between join() & get():
//        1-Handling exceptions: The join() method does not throw checked exceptions,
//        whereas the get() method throws checked exceptions.
//        Therefore, if you use join(), you don't need to handle checked exceptions explicitly.
//        2-Return value: The join() method returns the result if it is available,
//        otherwise it blocks the calling thread until the result is available.
//        On the other hand, the get() method returns the result if it is available,
//        otherwise it blocks the calling thread until the result is available or a timeout occurs.
//        3-Timeout: The get() method has an overloaded version that allows you to specify a timeout,
//        after which it throws a TimeoutException if the result is not available.
//        The join() method does not have a timeout parameter.
    }
}
