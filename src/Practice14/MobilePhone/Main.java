package Practice14.MobilePhone;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("09382591398");
        Contact soheyl = new Contact("soheyl","34635");
        Contact ali = new Contact("ali","45457567");
        Contact ehsan = new Contact("Ehsan","565475867");
        mobilePhone.addNewContact(soheyl);
        mobilePhone.addNewContact(ali);
        mobilePhone.addNewContact(ehsan);
       mobilePhone.printContact();
    }
}
