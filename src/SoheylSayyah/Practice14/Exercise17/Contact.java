package SoheylSayyah.Practice14.Exercise17;

public class Contact
{
    private String name;
    private String phoneNumber;
    public Contact(String name, String phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public Contact(String name)
    {
        this.name = name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    public String getName()
    {
        return name;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public static Contact createContact(String name,String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
