package practices.practice14.exercise17;

public class Main {
    public static void main(String[] args) {
        Contact contact1=Contact.createContact("Bob","31415926");
        Contact contact2=Contact.createContact("Alice","16180339");
        Contact contact3=Contact.createContact("Tom","11235813");
        Contact contact4=Contact.createContact("Jane","23571113");

        MobilePhone mobilePhone=new MobilePhone("0912-394-8447");
        System.out.println(mobilePhone.addNewContact(contact1));
        System.out.println(mobilePhone.addNewContact(contact2));
        System.out.println(mobilePhone.addNewContact(contact3));
//        System.out.println(mobilePhone.addNewContact(contact4));
        System.out.println(mobilePhone.addNewContact(contact1));
        System.out.println("*****************************************");
        mobilePhone.printContact();
        System.out.println("*****************************************");
        System.out.println(mobilePhone.findContact(contact1));
        System.out.println(mobilePhone.findContact(contact4));
        mobilePhone.printContact();
        System.out.println("*****************************************");
        System.out.println(mobilePhone.updateContact(contact1, contact4));
        mobilePhone.printContact();
        System.out.println("*****************************************");

        System.out.println(mobilePhone.findContact(contact1));
        System.out.println(mobilePhone.findContact(contact3));
        System.out.println(mobilePhone.findContact("Tom"));
        System.out.println(mobilePhone.findContact("16180339"));
        System.out.println("*****************************************");
        System.out.println(mobilePhone.removeContact(contact2));
        mobilePhone.printContact();
    }
}
