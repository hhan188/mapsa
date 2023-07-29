package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.BaseBankService;

import Bank.Management.Repository.Repository;
import Bank.Management.ServiceBusinessManager.AccountingService.Account;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;
import Bank.Management.ServiceBusinessManager.TransactionManagmentService.Transaction;
import Bank.Management.ServiceBusinessManager.TransactionManagmentService.TransactionType;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.UUID;
@Service
public class CreateBankDataService
{
    @PostConstruct
    public static void loadData() {
        Repository repository = Repository.INSTANCE;
        String logTrack = UUID.randomUUID().toString();

        Bank bank = new Bank("Pasargad");

        Branch branch = new Branch("Sarv");
        Branch branch1 = new Branch("Jordan");

        Account account = new Account("1");
        Account account1 = new Account("2");
        Account account2 = new Account("3");
        Account account3 = new Account("4");

        Customer customer = new Customer("1");
        Customer customer1 = new Customer("2");
        Customer customer2 = new Customer("3");
        Customer customer3 = new Customer("4");

        Transaction transaction = new Transaction(TransactionType.Deposit);
        Transaction transaction1 = new Transaction(TransactionType.Payment);
        Transaction transaction2 = new Transaction(TransactionType.Payment);
        Transaction transaction3 = new Transaction(TransactionType.Deposit);

        bank.getBranches().add(branch);
        bank.getBranches().add(branch1);

        branch.setBank(bank);
        branch1.setBank(bank);
        branch.getAccounts().add(account);
        branch.getAccounts().add(account1);
        branch1.getAccounts().add(account2);
        branch1.getAccounts().add(account3);

        account.getCustomers().add(customer);
        account.getCustomers().add(customer1);
        account2.getCustomers().add(customer2);
        account3.getCustomers().add(customer3);
        HashSet<Customer> set = new HashSet<>();
        set.add(customer);
        set.add(customer1);
        account.setCustomers(set);
        HashSet<Customer> set2 = new HashSet<>();
        set2.add(customer2);
        account2.setCustomers(set2);
        HashSet<Customer> set3 = new HashSet<>();
        set3.add(customer2);
        account3.setCustomers(set3);

        account.setBranch(branch);
        account1.setBranch(branch);
        account2.setBranch(branch1);
        account3.setBranch(branch1);

        account.getTransactions().add(transaction);
        account.getTransactions().add(transaction1);
        account3.getTransactions().add(transaction2);
        account2.getTransactions().add(transaction3);


        transaction.setAccount(account);
        transaction1.setAccount(account1);
        transaction3.setAccount(account2);
        transaction2.setAccount(account3);

        customer.getAccounts().add(account);
        customer1.getAccounts().add(account1);
        customer2.getAccounts().add(account2);
        customer3.getAccounts().add(account3);

        repository.createNewBank(bank,logTrack);
        repository.createNewCustomer(customer,logTrack);

    }
}
