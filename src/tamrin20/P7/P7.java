package tamrin20.P7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class P7 {
    public static void main(String[] args) {

        var myThreadPool = Executors.newFixedThreadPool(2);

        String predefinedResult = "This is a predefined Result";

        CompletableFuture.runAsync(() -> System.out.println(predefinedResult), myThreadPool);

        myThreadPool.shutdown();

    }
}
