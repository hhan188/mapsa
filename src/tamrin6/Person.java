package tamrin6;
//Problem 10 & 12 solution
public class Person {
    private String name;
    private short age;

    public String getName() {
        return name;
    }

    public short getAge() {
        return age;
    }

    public Person(String name, short age) {
        this.name = name;
        this.age = age;
    }



    public String compareAges(Person anotherPerson){
        if (this.age == anotherPerson.getAge())
            return "same age";
        if (this.age < anotherPerson.getAge())
            return "younger";
        return "older";
    }
}
