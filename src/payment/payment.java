package payment;

public interface payment {
    void processPayment(double amount);

    Class<BasePaymentMethod> getpaymentMethodType();


}
