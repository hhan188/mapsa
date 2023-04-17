package Prac7;

/**
 * inheritance practices - Soale 8
 * Create a class Mammal that extends Animal.
 * Add a boolean field isWarmBlooded and a constructor that initializes it.
 * Override the speak method to print "I am a mammal."
 */
public class Mammal extends Animal {
    private boolean isWarmBlooded;
    Mammal(String name, int age, boolean isWarmBlooded) {
        super(name, age);
        this.isWarmBlooded = isWarmBlooded;
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setWarmBlooded(boolean warmBlooded) {
        isWarmBlooded = warmBlooded;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void speak() {
        System.out.println("I am a mammal");
    }
}
