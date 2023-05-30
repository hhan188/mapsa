package tamrin14.s17p44;

public class Main {
    public static void main(String[] args) {

        MobilePhone myMobilePhone = new MobilePhone("09123456789");

        Contact c1 = new Contact("Bob", "31415926");
        System.out.println("addNewContact(c1): " + myMobilePhone.addNewContact(c1));

        Contact c2 = new Contact("Alice", "16180339");
        System.out.println("addNewContact(c2): " + myMobilePhone.addNewContact(c2));

        Contact c3 = new Contact("Tom", "11235813");
        System.out.println("addNewContact(c3): " + myMobilePhone.addNewContact(c3));

        Contact c4 = new Contact("Jane", "23571113");
        System.out.println("addNewContact(c4): " + myMobilePhone.addNewContact(c4));

        myMobilePhone.printContacts();

        boolean result;

        result = myMobilePhone.updateContact(c1,new Contact("Bob", "111-222-333"));
        System.out.println("updateContact(c1,new Contact(\"Bob\", \"111-222-333\"): " + result);

        result = myMobilePhone.removeContact(c4);
        System.out.println("myMobilePhone.removeContact(c4): " + result);

        myMobilePhone.printContacts();

        System.out.println("queryContact(To): "+myMobilePhone.queryContact("To"));
        System.out.println("queryContact(ice): "+myMobilePhone.queryContact("ice"));
    }
}
