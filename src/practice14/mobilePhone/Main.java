package practice14.mobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone=new MobilePhone("0935898854");
        Contact ali=new Contact("036589 ","Ali");
        Contact soheil=new Contact("365892 " + "","Soheil");
        mobilePhone.addNewContact(ali);
        mobilePhone.addNewContact(soheil);
        mobilePhone.printContacts();
    }
}
