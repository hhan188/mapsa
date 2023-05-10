package Practice11.classPractice;

public interface PaymentMethod {
    public boolean processPayment(double amount);

    public String getPaymentMethodType();
}
