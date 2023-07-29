package SoheylSayyah.Practice27.main.java.Bank.Management.Repository;

import Bank.Management.ServiceBusinessManager.AccountingService.Account;
import Bank.Management.ServiceBusinessManager.BaseBankService.Bank;
import Bank.Management.ServiceBusinessManager.BaseBankService.Branch;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;
import Bank.Management.ServiceBusinessManager.TransactionManagmentService.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Objects;

public enum MySqlDao {
    INSTANCE;
    private SessionFactory dataSource;
    public void init() throws Exception {
        createMySqlDataSource();
    }
    private void createMySqlDataSource() throws Exception {
        if (Objects.isNull(dataSource)) {
            this.dataSource = DataSourceFactory.createMySqlDataSource();
        }
    }
    public SessionFactory getDataSource() throws Exception {
        if (Objects.isNull(dataSource)) {
            createMySqlDataSource();
        }
        return this.dataSource;
    }
    public void stop() {
        this.dataSource.close();
    }
    public void createNewCustomer(Session connection, Customer customer) {
        CRUD<Customer> insert = new CRUD<>(Customer.class);
        insert.create(connection, customer);
    }
    public void createNewAccount(Session connection, Account account) {
        CRUD<Account> insert = new CRUD<>(Account.class);
        insert.create(connection, account);
    }
    public void createNewBank(Session connection, Bank bank) {
        CRUD<Bank> insert = new CRUD<>(Bank.class);
        insert.create(connection, bank);
    }
    public Customer getCustomerByCustomerNumber(Session connection, Customer customer) {
        Query query = connection.createQuery("SELECT c FROM  Customer c WHERE c.customerNumber LIKE :name");
        query.setParameter("name", customer.getCustomerNumber());
        List<Customer> customers = query.list();
        if (customers.size() == 0) {
            return null;
        } else
            return customers.get(0);
    }
    public Branch getBranchByCode(Session connection, Branch branch) {
        Query query = connection.createQuery("SELECT c FROM  Branch c WHERE c.branchCode LIKE :code");
        query.setParameter("code", "%" + branch.getBranchCode() + "%");
        List<Branch> branches = query.list();
        if (branches.size() == 0) {
            return null;
        } else
            return branches.get(0);
    }
    public void SaveOrUpdateNewTransaction(Session connection, Transaction transaction) {
        CRUD<Transaction> insert = new CRUD<>(Transaction.class);
        insert.create(connection, transaction);
    }
    public Account getAccountByAccountNumber(Session connection, Account account) {
        Query query = connection.createQuery("SELECT c FROM  Account c WHERE c.AccountNumber LIKE :code");
        query.setParameter("code", "%" + account.getAccountNumber() + "%");
        query.setCacheable(true);
        query.setCacheRegion("myQueryCache");
        List<Account> accounts = query.list();
        if (accounts.size() == 0) {
            return null;
        } else
            return accounts.get(0);
    }
    public Account getAccountByAccountNumber(Session connection, String account) {
        Query query = connection.createQuery("SELECT c FROM  Account c WHERE c.AccountNumber=:code");
        query.setParameter("code", account);
        query.setCacheable(true);
        List<Account> accounts = query.list();
        if (accounts.size() == 0) {
            return null;
        } else
            return accounts.get(0);
    }
}
