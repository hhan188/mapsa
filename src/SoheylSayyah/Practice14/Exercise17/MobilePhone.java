package SoheylSayyah.Practice14.Exercise17;

import java.util.ArrayList;

public class MobilePhone
{
    private String myNumber;
    ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber)
    {
        this.myNumber = phoneNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact)
    {
        myContacts.add(contact);
        return !myContacts.contains(contact);
    }

    public boolean updateContact(Contact old, Contact updated)
    {
        if (!myContacts.contains(old))
        {
            System.err.println("Contact Not Found!");
            return false;
        }
        int contactIndex = myContacts.indexOf(old);
        myContacts.set(contactIndex, updated);
        return true;
    }

    public boolean removeContact(Contact contact)
    {
        if (!myContacts.contains(contact))
        {
            System.err.println("Contact Not Found!");
            return false;
        }
        return myContacts.remove(contact);
    }

    public int findContact(Contact contact)
    {
        for (Contact item : myContacts){
            if (myContacts.contains(contact)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public int findContact(String name)
    {
//        int temp = -1;
//        for (int i = 0; i < myContacts.size() - 1; i++)
//        {
//            if (myContacts.contains(name))
//            {
//                temp = i;
//            }
//        }
//        return temp;
        Contact contact = new Contact(name);
        for (Contact item : myContacts){
            if (myContacts.contains(contact)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public Contact queryContact(String name){
        for (Contact contact : myContacts){
            if (contact.getName().equalsIgnoreCase(name)){
                return contact;
            }
        }
        return null;
    }
    public void printContacts(){
        for (int i = 0; i < myContacts.size(); i++)
        {
            System.out.println(i + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
