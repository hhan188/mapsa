package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.TransactionManagmentService;

import Bank.Management.Repository.Repository;
import Bank.Management.ServiceBusinessManager.AccountingService.Account;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TransactionService {
    Repository repository = Repository.INSTANCE;
    public void paymentTransaction(long amount, String customerNumber, String AccountNumber) {
        String logTrack = String.valueOf(UUID.randomUUID());
        Transaction transaction = new Transaction();
        transaction.setTransactionType(TransactionType.Payment);
        transaction.setStatus(Status.InProgress);
        transaction.setInsertdate(new Date());
        transaction.setAmount(amount);
        repository.SaveOrUpdateNewTransaction(transaction,logTrack);
        Customer customer = new Customer(customerNumber);
        Account account = new Account(AccountNumber);
        if (repository.getCustomerByCustomerNumber(customer, logTrack) != null &&
                repository.getAccountByAccountNumber(account, logTrack) != null) {
            account = repository.getAccountByAccountNumber(account, logTrack);
            if (account.getBalance() >= amount) {
                transaction.setStatus(Status.Success);
                transaction.setRrn(String.valueOf(Math.random() * 100000));
                transaction.setUpdatedate(new Date());
                transaction.setLogResponse("Successful :)");
                account.setBalance(account.getBalance() - amount);
                account.setTransactions(List.of(transaction));
                transaction.setAccount(account);
                repository.SaveOrUpdateNewTransaction(transaction, logTrack);
            } else {
                System.err.println("Not Enough Balance!");
                transaction.setLogResponse("Failed :(");
                transaction.setStatus(Status.Fail);
                repository.SaveOrUpdateNewTransaction(transaction, logTrack);
            }
        } else {
            System.err.println("Customer Not Found!");
            transaction.setLogResponse("Failed :(");
            transaction.setStatus(Status.Fail);
            repository.SaveOrUpdateNewTransaction(transaction, logTrack);
        }
    }
    public void depositTransaction(long amount, String customerNumber, String AccountNumber) {
        String logTrack = String.valueOf(UUID.randomUUID());
        Transaction transaction = new Transaction();
        transaction.setTransactionType(TransactionType.Deposit);
        transaction.setStatus(Status.InProgress);
        transaction.setInsertdate(new Date());
        transaction.setAmount(amount);
        repository.SaveOrUpdateNewTransaction(transaction,logTrack);
        Customer customer = new Customer(customerNumber);
        Account account = new Account(AccountNumber);
        if (repository.getCustomerByCustomerNumber(customer, logTrack) != null &&
                repository.getAccountByAccountNumber(account, logTrack) != null) {
            account = repository.getAccountByAccountNumber(account, logTrack);
                transaction.setStatus(Status.Success);
                transaction.setRrn(String.valueOf(Math.random() * 100000));
                transaction.setUpdatedate(new Date());
                transaction.setLogResponse("Successful :)");
                account.setBalance(account.getBalance() + amount);
                account.setTransactions(List.of(transaction));
                transaction.setAccount(account);
                transaction.setAmount(amount);
                repository.SaveOrUpdateNewTransaction(transaction, logTrack);
        } else {
            System.err.println("Customer Not Found!");
            transaction.setLogResponse("Failed :(");
            transaction.setStatus(Status.Fail);
            repository.SaveOrUpdateNewTransaction(transaction, logTrack);
        }
    }
}
