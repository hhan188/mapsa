package com.practice14.Excersice44;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone
{
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public MobilePhone(String myNumber)
    {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact c)
    {
        if (findContact(c) == -1)
        {
            myContacts.add(c.createContact());
            return true;
        }
        return false;
    }


    public boolean updateContact (Contact c, Contact v)
    {
        int index = findContact(c);
        if (index >= 0)
        {
            myContacts.set(index, v);
            return true;
        }
        return false;
    }


    public boolean removeContact (Contact c)
    {
        if (findContact(c) > 0)
        {
            myContacts.remove(myContacts.get(findContact(c)));
            return true;
        }
        return false;
    }

    private int findContact(Contact c)
    {
        for (int i=0; i < myContacts.size(); i++)
        {
            if (myContacts.get(i).getName().equalsIgnoreCase(c.getName()))
            {
                return i;
            }
        }
        return -1;
    }


    private int findContact(String name)
    {
        for (int i=0; i < myContacts.size(); i++)
        {
            if (myContacts.get(i).getName().equalsIgnoreCase(name))
            {
                return i;
            }
        }
        return -1;
    }



    private Contact queryContact(String name)
    {
        for (int i=0; i < myContacts.size(); i++)
        {
            if (myContacts.get(i).getName().equalsIgnoreCase(name))
            {
                return myContacts.get(i);
            }
        }
        return null;
    }


    public void printContacts()
    {
        for (Contact item:myContacts)
        {
            System.out.println(item.getName() + " -> " + item.getPhoneNumber());
        }
    }
}
