package Prac14.P44;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addContact(Contact contact) {
        if (myContacts.contains(contact))
            return false;

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);

        if (index < 0)
            return false;

        myContacts.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int index = findContact(contact);

        if (index < 0)
            return false;

        myContacts.remove(contact);
        return true;
    }

    private int findContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    private int findContact(String name) {
        Contact contact = myContacts.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElse(null);

        return contact != null ? myContacts.indexOf(contact) : -1;
    }

    public String queryContact(String name) {
        int index = findContact(name);

        if (index < 0)
            return null;

        Contact contact = myContacts.get(index);

        return contact.getName() + " -> " + contact.getNumber();
    }

    public void printContacts() {
        System.out.println("Contacts list :");
        int counter = 1;
        for (Contact contact : myContacts) {
            System.out.println(
                    counter + ". " + contact.getName() + " -> " + contact.getNumber()
            );
            counter++;
        }
    }
}
