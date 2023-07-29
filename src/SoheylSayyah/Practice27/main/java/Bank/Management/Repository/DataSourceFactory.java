package SoheylSayyah.Practice27.main.java.Bank.Management.Repository;

import Bank.Management.ServiceBusinessManager.AccountingService.Account;
import Bank.Management.ServiceBusinessManager.BaseBankService.Bank;
import Bank.Management.ServiceBusinessManager.BaseBankService.Branch;
import Bank.Management.ServiceBusinessManager.CustomerService.Customer;
import Bank.Management.ServiceBusinessManager.TransactionManagmentService.Transaction;
import Bank.Management.Services.LogService;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import java.util.Properties;

public class DataSourceFactory {
    private static final LogService logger = LogService.INSTANCE;
    static SessionFactory createMySqlDataSource() {
        try {
            Properties properties = new Properties();
            properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/mapsa");
            properties.put(Environment.USER, "root");
            properties.put(Environment.FORMAT_SQL, "true");
            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.HBM2DDL_AUTO, "update");
//            properties.put(Environment.USE_QUERY_CACHE,"true");
//            properties.put(Environment.USE_SECOND_LEVEL_CACHE , "true");
//            properties.put(Environment.CACHE_REGION_FACTORY,"org.hibernate.cache.ehcache.EhCacheRegionFactory");
            return new Configuration()
                    .setProperties(properties)
                    .addAnnotatedClass(Account.class)
                    .addAnnotatedClass(Bank.class)
                    .addAnnotatedClass(Branch.class)
                    .addAnnotatedClass(Transaction.class)
                    .addAnnotatedClass(Customer.class)
                    .buildSessionFactory();
        } catch (Exception ex) {
            logger.error("Build Session Factory Failed :" + ex);
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }
}
