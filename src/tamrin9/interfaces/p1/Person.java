package tamrin9.interfaces.p1;

public class Person implements Sortable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean compare(Person other) {
        return age < other.getAge();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: " + name +
                ", age: " + age +
                '}';
    }
}
