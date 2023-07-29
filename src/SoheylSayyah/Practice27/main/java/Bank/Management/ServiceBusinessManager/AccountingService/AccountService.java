package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.AccountingService;

import Bank.Management.Repository.Repository;
import Bank.Management.ServiceBusinessManager.BaseBankService.Branch;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
@Service
public class AccountService {
    Repository repository = Repository.INSTANCE;
    public void createSampleCustomerForUser() {
        String logTrack = String.valueOf(UUID.randomUUID());
        Account account = new Account();
        account.setTransactions(null);
        account.setBalance(2000000);
        Branch branch = new Branch("Jordan");
        branch = repository.getBranchByCode(branch, logTrack);
        if (branch == null) {
            System.err.println("branch not found ");
            return;
        } else {
            account.setBranch(branch);
            String[] accountNumber = {"1234"};
            String[] customerNumbers = {"11", "2"};
            account.setAccountNumber(accountNumber[0]);
            Set<Account> accountSet = new HashSet<>();
            for (String customerNumber : customerNumbers) {
                Customer customer = new Customer(customerNumber);
                if (repository.getCustomerByCustomerNumber(customer, logTrack) == null) {
                    account.getCustomers().add(customer);
                    accountSet.add(account);
                    customer.setAccounts(accountSet);
                } else {
                    customer = repository.getCustomerByCustomerNumber(customer, logTrack);
                    account.getCustomers().add(customer);
                    accountSet.add(account);
                    customer.setAccounts(accountSet);
                }
                repository.createNewCustomer(customer, logTrack);
                System.out.println("createAccountForUser SUCCESS");
            }
        }
    }
    public void sampleTestForCatchData(String account){
        repository.getAccountByAccountNumber(account,"11");
        repository.getAccountByAccountNumber(account,"11");
    }
}
