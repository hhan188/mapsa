package SoheylSayyah.Practice27.main.java.Bank.Management.Services;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

public enum LogService {
    INSTANCE;
    private final BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final AtomicBoolean closed = new AtomicBoolean(false);
    public BlockingQueue<String> getBlockingQueue() {
        return blockingQueue;
    }
    public void init() {
        executorService.submit(() -> {
            //!Thread.currentThread().isInterrupted()
            while (!closed.get()) {
                try {
                    String message = blockingQueue.take();
                    System.out.println("logService ----> " + message);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void stop() {
        closed.set(true);

    }
    public void error(String logMessage) {
        String log = "Error:".concat(logMessage);
        //add error to queue
        try {
            getBlockingQueue().add(log);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void info(String logMessage) {
        String log = "Info:".concat(logMessage);
        //add error to queue
        try {
            getBlockingQueue().add(logMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
