package SoheylSayyah.Practice27.main.java.Bank.Management.Exception;

public class BusinessException extends Exception {
    public BusinessException(businessResponseStatus status) {
    }
    public enum businessResponseStatus {
        SUCCESS(0),
        FAILED(1000),
        UNKNOWN(1201);

        businessResponseStatus(int value) {
        }
    }
}
