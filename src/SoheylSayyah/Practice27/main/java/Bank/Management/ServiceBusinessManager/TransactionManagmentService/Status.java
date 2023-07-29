package SoheylSayyah.Practice27.main.java.Bank.Management.ServiceBusinessManager.TransactionManagmentService;

public enum Status {
    InProgress(0),
    Success(1),
    Fail(2);
    final int code;
    Status(int code) {
        this.code = code;
    }
}
