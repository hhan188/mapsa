package Practice20.fourth;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

            ExecutorService executorService = Executors.newSingleThreadExecutor();
            CompletableFuture<String> futureResult = CompletableFuture.supplyAsync(() -> "Hello",executorService);

        System.out.println(futureResult.get());
    }

    }

