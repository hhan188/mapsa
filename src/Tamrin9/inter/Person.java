package Tamrin9.inter;

//Create an interface called Sortable with a method compare().
// Create classes Person, Car, and House that implement the Sortable interface.
// Write a program that creates an array of Sortable objects and sorts them using the compare() method.

public class Person implements Sortable{
    private String name;
    private int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
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



    @Override
    public int compare(Sortable compareObj) {
        Person person = (Person) compareObj;
        if (age > person.getAge())
            return 1;
        else if (age < person.getAge())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return name + " : \n" + "age => " + age;
    }
}
