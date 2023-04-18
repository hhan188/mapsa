package practices.practice71.exercise18;

import practices.practice71.exercise13.Person;

import java.util.Arrays;

public class PersonAverageAge {

    private Person[] people;
    Person person=new Person();
    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public int getAge(Person person) {
        return person.getAge();
    }

    public double average() {
        int sum = 0;
        int[] ints = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            ints[i] = getAge(getPeople()[i]);
            sum+=ints[i];
        }
        System.out.println(Arrays.toString(ints));
        return  sum / (double)people.length;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + person.getName() + '\'' +
                ", age=" + person.getAge() +
                '}';
    }
}
