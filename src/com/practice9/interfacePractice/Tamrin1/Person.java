package com.practice9.interfacePractice.Tamrin1;

import java.util.List;

public class Person implements Sortable
{
    private String name;
    private int age;
    private List<Person> people;

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public void compare()
    {
        Person person;
        for (int i = 0; i < people.size(); i++)
        {
            for (int j = i+1; j < people.size(); j++)
            {
                if (people.get(i).age < people.get(j).age)
                {
                    person = people.get(i);
                    people.set(i, people.get(j));
                    people.set(j, person);
                }
            }
        }
    }

    @Override
    public String toString() {
        String print = "";
        for (Person person : getPeople())
        {
            print += "Person {" + "name = " + person.name + ", price = " + person.age + '}' + "\n";
        }
        return print;
    }
}
