package tamrin6;
// Problem 9 solution
public class PersonInfo {
    private String firstName;
    private String lastName;
    private short age;

    public PersonInfo(String firstName, String lastName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void getFullName(){
        System.out.println("Full name: " + firstName + " " + lastName);
    }
}
