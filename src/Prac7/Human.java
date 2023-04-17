package Prac7;

/**
 * inheritance practices - Soale 9
 * Create a class Human that extends Mammal.
 * Add a String field firstName, a String field lastName, and a constructor that initializes these fields.
 * Override the speak method to print "My name is [first name] [last name]."
 */
public class Human extends Mammal{
    private String firstName;
    private String lastName;

    Human(String firstName, String lastName, int age) {
        super("human", age, true);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void speak() {
        System.out.println("my name is " + firstName + " " + lastName);
    }
}
