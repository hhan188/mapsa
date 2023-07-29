package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.TransactionManagmentService;

public enum TransactionType {
    Payment(0, "paymentTransaction"),
    Refund(1,"RefundTransaction"),
    Deposit(2,"DepositTransaction");
    TransactionType(int code, String description) {
    }
}
