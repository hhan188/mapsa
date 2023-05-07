package practices.practice10.exercise30;

public class Person {

    private String firstName;
    private String secondName;
    private int age;

    public Person() {
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age >= 100) {
            age = 0;
        }
        this.age = age;
    }

    protected boolean isTeen() {
        return getAge() >= 13 && getAge() <= 19;
    }

    protected String getFullName() {

        if (!getFirstName().isEmpty() && !getSecondName().isEmpty()) {
            return getFirstName() + " " + getSecondName();
        } else if (getFirstName().isEmpty()) {
            return getSecondName();

        } else if (getSecondName().isEmpty()) {
            return getFirstName();
        }
        return "";
    }
}
