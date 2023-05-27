package Practice14.MobilePhone;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contact> myContacts;
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myContacts = myContacts;
        myContacts=new ArrayList<>();
    }

    public  boolean addNewContact(Contact contact){
       if (myContacts.contains(contact)){
           return false;
       }
       myContacts.add(contact);
        return true;
    }
    public boolean updateContact(Contact oldContact,Contact updateContact){
        if (!myContacts.contains(oldContact)){
            System.out.println("This phone number is not exists");
            return false;
        }
        int indexContact=myContacts.indexOf(oldContact);
        myContacts.set(indexContact,updateContact);
        return true;
    }
    public boolean removeContact(Contact contact){
        if (!myContacts.contains(contact)){
            System.out.println("contact is not exists");
            return false;
        }
        myContacts.remove(contact);
        return true;
    }
    public int findeContact(Contact contact){
        for (Contact item:myContacts) {
            if (!myContacts.contains(item)){
                System.out.println("This phone number is not exist");
                return -1;
            }

        }
        int indexContact = myContacts.indexOf(contact);
        return indexContact;

    }
    public int findeContact(String contact){

        for (int i = 0; i < myContacts.size(); i++) {
            if (!myContacts.contains(contact))
                return -1;
        }
        return myContacts.indexOf(contact);


    }
    public Contact queryContact(String name){
        for (Contact item:myContacts) {
            if (item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        System.err.println("Contact not found");
        return null;
    }

   public void printContact(){
       for (int i = 0; i < myContacts.size(); i++) {
           System.out.println(i +" "+myContacts.get(i).getName()+"->"+myContacts.get(i).getPhoneNumber());
       }
   }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "myContacts=" + myContacts +
                ", myNumber='" + myNumber + '\'' +
                '}';
    }
}
