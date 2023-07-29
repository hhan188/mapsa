package SoheylSayyah.Practice27.main.java.Bank.Management.Repository;

import Bank.Management.ServiceBusinessManager.AccountingService.Account;
import Bank.Management.ServiceBusinessManager.BaseBankService.Bank;
import Bank.Management.ServiceBusinessManager.BaseBankService.Branch;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;
import Bank.Management.ServiceBusinessManager.TransactionManagmentService.Transaction;
import Bank.Management.Services.LogService;
import org.hibernate.Session;

import java.util.Objects;

public enum Repository {
    INSTANCE;
    private final LogService logger = LogService.INSTANCE;
    public void init() throws Exception {
        MySqlDao.INSTANCE.init();
    }
    public void stop() {
        MySqlDao.INSTANCE.stop();
    }
    public void createNewCustomer(Customer customer, String logTrack) {
        Session connection = null;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            MySqlDao.INSTANCE.createNewCustomer(connection, customer);
        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewCustomer --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
        } finally {
            if (!Objects.isNull(connection)) {
                try {
                    connection.close();
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
            }
        }
    }
    public void createNewBank(Bank bank, String logTrack) {
        Session connection = null;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            MySqlDao.INSTANCE.createNewBank(connection, bank);
        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);

        } finally {
            if (!Objects.isNull(connection)) {
                try {
                    connection.close();
                } catch (Exception e) {
                    logger.error(e.getMessage());
                }
            }
        }
    }
    public Customer getCustomerByCustomerNumber(Customer customer, String logTrack) {
        Session connection;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            return MySqlDao.INSTANCE.getCustomerByCustomerNumber(connection, customer);

        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
            return null;
        }
    }
    public Branch getBranchByCode(Branch branch, String logTrack) {
        Session connection;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            return MySqlDao.INSTANCE.getBranchByCode(connection, branch);

        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
            return null;
        }
    }
    public void createNewAccount(Account account, String logTrack) {
        Session connection;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            MySqlDao.INSTANCE.createNewAccount(connection, account);

        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
        }
    }
    public void SaveOrUpdateNewTransaction(Transaction transaction, String logTrack) {
        Session connection;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            MySqlDao.INSTANCE.SaveOrUpdateNewTransaction(connection, transaction);

        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
        }
    }
    public Account getAccountByAccountNumber(Account account, String logTrack) {
        Session connection;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            return MySqlDao.INSTANCE.getAccountByAccountNumber(connection, account);

        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
            return null;
        }
    }
    public Account getAccountByAccountNumber(String account, String logTrack) {
        Session connection;
        try {
            connection = MySqlDao.INSTANCE.getDataSource().openSession();
            return MySqlDao.INSTANCE.getAccountByAccountNumber(connection, account);

        } catch (Exception e) {
            String logMessage =
                    "Exception in createNewBank --> "
                            + " logTrack: " + logTrack + " e: " + e.getMessage();
            logger.error(logMessage);
            return null;
        }
    }
    public void initPayment() throws Exception
    {
        TransactionExecutor.Instance.Payment();
    }
    public void initDeposit() throws Exception{
        TransactionExecutor.Instance.Deposit();
    }
}