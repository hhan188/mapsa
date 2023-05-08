package Practice10.person;

public class Person {
        private String firstName;
        private String lastName;
        private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

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
        if (age<0){
            age=0;
        }else if (age>100){
            age=0;
        }
    }
    public boolean isTeen(){
        if (age>12||age<20){
            return true;
        }else return false;
    }
    public String getFullName(){
        if (firstName==null&&lastName==null){
            return null;
        } else if (firstName==null) {
            return lastName;
        }else if (lastName==null){
            return firstName;
        }
        return firstName+lastName;
    }

}
