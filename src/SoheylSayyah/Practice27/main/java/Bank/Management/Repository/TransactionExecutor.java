package SoheylSayyah.Practice27.main.java.Bank.Management.Repository;

import Bank.Management.ServiceBusinessManager.TransactionManagmentService.TransactionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public enum TransactionExecutor
{
    Instance;
    public void Payment(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            TransactionService transactionService = new TransactionService();
            for (int i = 1; i <= 10 ; i++)
            {
                transactionService.paymentTransaction(200 , "1" , "1");
            }
        });
        executorService.shutdown();
    }
    public void Deposit(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(() -> {
            TransactionService transactionService = new TransactionService();
            for (int i = 1; i <= 10 ; i++)
            {
                transactionService.depositTransaction(100 , "1" , "1");
            }
        });
        executorService.shutdown();
    }
}
