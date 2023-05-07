package Prac10.P30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (!firstName.isEmpty() && lastName.isEmpty())
            return firstName;

        if (firstName.isEmpty() && !lastName.isEmpty())
            return lastName;

        if (firstName.isEmpty())
            return "";

        return firstName + " " + lastName;
    }
}
