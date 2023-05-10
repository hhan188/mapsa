package Practice11.classPractice;

public abstract class BasePaymentMethod implements PaymentMethod{

    @Override
    public  String getPaymentMethodType(){
        return "null";

    };

    public abstract String getCardNumber();


}
