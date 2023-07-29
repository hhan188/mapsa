package SoheylSayyah.Practice27.main.java.Bank.Management.Server;


import Bank.Management.Repository.Repository;

public class Server {
    public static void main(String[] args) throws Exception {
        final Server server = new Server();
        server.initServerComponents();
    }
    private void initServerComponents() throws Exception {
        Repository.INSTANCE.init();
//        initPaymentTransaction();
//        initDepositTransaction();
//        CreateBankData.loadData();
//        AccountService accountService = new AccountService();
//        accountService.createSampleCustomerForUser();
//        TransactionService transactionService = new TransactionService();
//        transactionService.paymentTransaction(5000000, "1", "1");
//        transactionService.depositTransaction(200000 , "1" , "1");
//        Account a = new Account("1234");
//        accountService.sampleTestForCatchData("1234");
    }
    private void stop() {
        Repository.INSTANCE.stop();
    }
    private static void initPaymentTransaction() throws Exception {
        Repository.INSTANCE.initPayment();
    }
    private static void initDepositTransaction() throws Exception{
        Repository.INSTANCE.initDeposit();
    }
}
