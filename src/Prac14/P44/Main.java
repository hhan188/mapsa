package Prac14.P44;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234");

        mobilePhone.addContact(new Contact("mmd", "123"));
        mobilePhone.addContact(new Contact("abbas", "125"));
        mobilePhone.addContact(new Contact("asghar", "712631"));

        System.out.println("print without removing");
        mobilePhone.printContacts();

        System.out.println("print after remove abbas");
        mobilePhone.removeContact(new Contact("abbas", "125"));
        mobilePhone.printContacts();
    }
}
