package tamrin10.s4p30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20) ? true : false;
    }

    public String getFullName() {

        boolean f = getFirstName().isEmpty();
        boolean l = getLastName().isEmpty();

        if (f && l) {
                return "";
        }
        if (f)
            return getLastName();
        if (l)
            return getFirstName();

        return getFirstName() + " " + getLastName();


    }
}
