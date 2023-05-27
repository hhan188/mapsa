package practices.practice14.exercise17;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public void setMyContacts(List<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }


    /*
    methods need
    **/

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) < 0)
            return getMyContacts().add(contact);
        else return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) >= 0) {
            removeContact(oldContact);
            return addNewContact(newContact);
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return getMyContacts().remove(contact);
        } else return false;
    }

    public int findContact(Contact contact) {
        return getMyContacts().indexOf(contact);
    }

    public int findContact(String sample) {
        for (int i = 0; i < getMyContacts().size(); i++) {
            if (sample.equalsIgnoreCase(getMyContacts().get(i).getName())
                    || sample.equals(getMyContacts().get(i).getPhoneNumber())) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        Contact contact = new Contact();
        for (int i = 0; i < getMyContacts().size(); i++) {
            if (name.equalsIgnoreCase(getMyContacts().get(i).getName())) {
                contact = getMyContacts().get(i);
            } else contact = null;
        }
        return contact;
    }

    public void printContact() {
        for (int i = 0; i < getMyContacts().size(); i++) {
            System.out.println((1+i )+". " + getMyContacts().get(i).getName()
                    + " -> " + getMyContacts().get(i).getPhoneNumber());
        }
    }
}
