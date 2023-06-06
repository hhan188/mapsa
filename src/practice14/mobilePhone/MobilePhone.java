package practice14.mobilePhone;

import java.util.ArrayList;

public class MobilePhone {
   private String myNumber;
   ArrayList<Contact> myContact;

   public MobilePhone(String myNumber) {
      this.myNumber = myNumber;
      myContact = new ArrayList<Contact>();
   }
   public boolean addNewContact(Contact contact){
      myContact.add(contact);
      return !myContact.contains(contact);

   }
   public boolean updateContact(Contact old,Contact update){
      if (!myContact.contains(old)){
         System.err.println("Contact Not Found");
         return false;
      }
      int contactIndex=myContact.indexOf(old);
       myContact.set(contactIndex,update);
      return true;
   }
   public boolean removeContact(Contact contact){
      if (!myContact.contains(contact)){
         System.err.println("Contact Not Found");
         return false;
      }
      return myContact.remove(contact);

   }
   public int findContact(Contact contact){
      if (myContact.contains(contact)){

         return myContact.indexOf(contact);
      }
      return -1;
   }
   public Contact queryContact(String name){
      for (Contact contact : myContact){
         if (contact.getName().equals(name)){
            return contact;
         }
      }return null;
   }
   public void printContacts(){
      for (Contact contact: myContact){
         System.out.println(contact.getName()+contact.getPhoneNumber());
      }
   }

}
