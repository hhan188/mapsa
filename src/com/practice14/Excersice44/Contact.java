package com.practice14.Excersice44;

public class Contact
{
    private String  name, phoneNumber;


    public Contact(String contactName, String number)
    {
        name = contactName;
        phoneNumber = number;
    }


    public String getName()
    {
        return name;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public Contact createContact()
    {
        return new Contact(name, phoneNumber);
    }
}
