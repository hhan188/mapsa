package Prac7;

/**
 * inheritance practices - Soale 1
 * Create a class Animal with a String field name and an int field age.
 * Create a constructor that initializes these fields.
 * Create a method speak that prints "I am an animal."
 */
public class Animal {
    private String name;
    private int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("i am an animal");
    }
}
