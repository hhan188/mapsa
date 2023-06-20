package tamrin20.P3;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class P3 {

    private static int[][] targetArray;
    private static int lengthOfRow;

    public static void main(String[] args) {

        targetArray = multiDimensionalArrayGenerator(4, 100);
        lengthOfRow = 100;

        singleThreadSolution();
        System.out.println();
        multiThreadSolution();
    }

    private static void singleThreadSolution() {

        Supplier<Integer> s0 = () -> P3.findMaxOfRow(0);
        Supplier<Integer> s1 = () -> P3.findMaxOfRow(1);
        Supplier<Integer> s2 = () -> P3.findMaxOfRow(2);
        Supplier<Integer> s3 = () -> P3.findMaxOfRow(3);

        Runnable code = () -> {
            int max = Integer.max(s0.get(),Integer.max(s1.get(), Integer.max(s2.get(), s3.get())));
            System.out.println("Max is: " + max);
        };

        Thread solution = new Thread(code);

        System.out.println("--- Single thread solution -->");

        Instant end;
        Instant start = Instant.now();

        solution.start();
        try {
            solution.join();
            end = Instant.now();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Execution duration is: " + Duration.between(start, end).toMillis() + " ms");

    }

    private static void multiThreadSolution() {
        var myThreadPool = Executors.newFixedThreadPool(5);

        Supplier<Integer> s0 = () -> P3.findMaxOfRow(0);
        Supplier<Integer> s1 = () -> P3.findMaxOfRow(1);
        Supplier<Integer> s2 = () -> P3.findMaxOfRow(2);
        Supplier<Integer> s3 = () -> P3.findMaxOfRow(3);

        System.out.println("--- Multi thread solution -->");

        Instant start = Instant.now();

        var CF0 = CompletableFuture.supplyAsync(s0, myThreadPool);
        var CF1 = CompletableFuture.supplyAsync(s1, myThreadPool);
        var CF2 = CompletableFuture.supplyAsync(s2, myThreadPool);
        var CF3 = CompletableFuture.supplyAsync(s3, myThreadPool);

        CompletableFuture.allOf(CF0, CF1, CF2, CF3).thenRun(() ->
                CF0.thenCombineAsync(CF1, Integer::max)
                        .thenCombineAsync(CF2, Integer::max)
                        .thenCombineAsync(CF3, Integer::max)
                        .thenAcceptAsync(max -> System.out.println("Max value is: " + max)));

        Instant end = Instant.now();

        System.out.println("Execution duration is: " + Duration.between(start, end).toMillis() + " ms");

        myThreadPool.shutdown();
    }

    public static int findMaxOfRow(int i) {

        int max = 0;

        for (int j = 0; j < lengthOfRow; j++) {
            if (targetArray[i][j] > max) {
                max = targetArray[i][j];
            }
        }

        return max;
    }

    public static int[][] multiDimensionalArrayGenerator(int x, int y) {

        int[][] demoArray = new int[x][y];

        for (int i = 0; i < x; i++) {
//            System.out.println();
            for (int j = 0; j < y; j++) {
                demoArray[i][j] = (int) (Math.random() * 1000);
//                System.out.print(demoArray[i][j] + " ");

            }
        }

        System.out.println();
        return demoArray;
    }
}
