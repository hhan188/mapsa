package Practice11.classPractice;

public class CreditCard extends BasePaymentMethod{

    private String cardNumber;
    @Override
    public boolean processPayment(double amount) {
        System.out.println("amount"+amount+"procese from card number"+amount);
        return false;
    }

    @Override
    public String getPaymentMethodType() {
        return null;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }
}
