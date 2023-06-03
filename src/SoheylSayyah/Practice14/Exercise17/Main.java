package SoheylSayyah.Practice14.Exercise17;

public class Main
{
    public static void main(String[] args)
    {
        MobilePhone mobilePhone = new MobilePhone("09356333666");
        Contact ali = new Contact("Ali","09194078101");
        Contact eshan = new Contact("Ehsan","09382591398");
        mobilePhone.addNewContact(ali);
        mobilePhone.addNewContact(eshan);
        mobilePhone.printContacts();
    }
}
