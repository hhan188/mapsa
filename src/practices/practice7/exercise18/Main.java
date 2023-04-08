package practices.practice7.exercise18;

import practices.practice7.exercise13.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //person1
        Person person1 = new Person();
        person1.setName("yaser");
        person1.setAddress("Tehran");
        person1.setAge(36);

        //person2
        Person person2=new Person();
        person2.setName("Reza");
        person2.setAddress("Karaj");
        person2.setAge(25);

        //person3
        Person person3=new Person();
        person3.setName("Mahnaz");
        person3.setAddress("Shiraz");
        person3.setAge(18);

        //Person4
        Person person4=new Person();
        person4.setName("Nazanin");
        person4.setAddress("Lorestan");
        person4.setAge(62);

        //person5
        Person person5=new Person();
        person5.setName("Ahmad");
        person5.setAddress("Ardebil");
        person5.setAge(1);

        PersonAverageAge personAverageAge =new PersonAverageAge();
        Person[] people = {person1, person2, person3, person4, person5};
        personAverageAge.setPeople(people);
        System.out.println(Arrays.toString(people));

        System.out.println("Average Age Of The People is: "+ personAverageAge.average());
    }
}
