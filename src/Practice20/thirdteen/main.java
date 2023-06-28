package Practice20.thirdteen;

import java.util.concurrent.*;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService lastExe=Executors.newSingleThreadExecutor();
        CompletableFuture<Double> result=getHight().thenCombineAsync(getWidth(),(heighT,widtH)->
        {return heighT*widtH; },lastExe);
        System.out.println(result.get());
    }
    public static CompletableFuture<Double> getHight(){
        ExecutorService firstExe= Executors.newSingleThreadExecutor();
        CompletableFuture<Double> height=CompletableFuture.supplyAsync(()-> 12.00,firstExe);
        return height;
    }

    public static CompletableFuture<Double> getWidth(){
        ExecutorService secondExe=Executors.newSingleThreadExecutor();
        CompletableFuture<Double> width=CompletableFuture.supplyAsync(()->6.00,secondExe);
        return width;

    }
}
