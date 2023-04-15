package Prac6;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String compareAges(Person anotherPerson) {
        if(age > anotherPerson.age) {
            return "Older";
        } else if (age < anotherPerson.age) {
            return "Younger";
        } else {
            return "Same age";
        }
    }
}
