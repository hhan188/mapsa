package sajjadEmami.Prac6;

public class PersonInfo {
    private String firstName;
    private String lastName;
    private int age;

    public PersonInfo(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
