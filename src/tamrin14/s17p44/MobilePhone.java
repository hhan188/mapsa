package tamrin14.s17p44;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) == -1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != -1) {
            myContacts.set(findContact(oldContact), newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {

        if (findContact(contact) != -1) {
            myContacts.remove(findContact(contact));
            return true;
        }
        return false;
    }


    private int findContact(Contact contact) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).equals(contact))
                return i;
        }
        return -1;
    }

    private int findContact(String str) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().contains(str)
                    || myContacts.get(i).getPhoneNumber().contains(str))
                return i;
        }

        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) != -1)
            return myContacts.get(findContact(name));

        return null;
    }

    public void printContacts() {
        System.out.println("\nContact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println((i + 1) + ". " + myContacts.get(i));
        }
        System.out.println();
    }
}
