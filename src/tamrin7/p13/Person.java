package tamrin7.p13;

//Problem 13
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age,String address) {
        setName(name);
        setAge(age);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
