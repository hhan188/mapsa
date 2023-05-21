package payment;

public abstract class BasePaymentMethod implements payment {
    public Class<? extends BasePaymentMethod> getpaymentMethodType(BasePaymentMethod T) {
        return  T.getClass() ;
    }
    public abstract int getCardNumber();
}
