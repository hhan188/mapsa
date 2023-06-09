package Practice10.tamrine2;

public class UsingPerson {
    public static void main(String[] args) {
        Person person=new Person();
        person.setFirstName("sara");
        person.setLastName(" ");
        person.setAge(-3);
        System.out.println(person.isTeen());
        System.out.println(person.getFullName());
    }
}
