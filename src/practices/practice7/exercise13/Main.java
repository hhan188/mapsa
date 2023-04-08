package practices.practice7.exercise13;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("yaser");
        person1.setAddress("Tehran");
        person1.setAge(36);
        Person person2 = new Person();
        person2.setName("Reza");
        person2.setAddress("Karaj");
        person2.setAge(25);
        Person person3 = new Person();
        person3.setName("Mahnaz");
        person3.setAddress("Shiraz");
        person3.setAge(18);
        Person person4 = new Person();
        person4.setName("Nazanin");
        person4.setAddress("Lorestan");
        person4.setAge(62);
        Person person5 = new Person();
        person5.setName("Ahmad");
        person5.setAddress("Ardebil");
        person5.setAge(45);
        Person[] persons = {person1, person2, person3, person4, person5};
        System.out.println(Arrays.toString(persons));
    }
}
