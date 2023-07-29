package SoheylSayyah.Practice27.main.java.Bank.Management.Server;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public enum Config {
    INSTANCE;
    public String getConfigValue(String key) {
        return System.getenv(key);
    }
    public ThreadPoolExecutor getConfiguredExecutor() {
        int coreSize = Runtime.getRuntime().availableProcessors() * 4;
        int maxSize = 400;
        long keepAliveTime = 60L;
        int queueSize = 400;
        return new ThreadPoolExecutor(coreSize, maxSize, keepAliveTime, TimeUnit.SECONDS, new LinkedBlockingQueue<>(queueSize));
    }
}
