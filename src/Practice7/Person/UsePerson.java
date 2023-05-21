package Practice7.Person;

import Practice7.Person.Person;

public class UsePerson {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people [0] = new Person("Ehsan",26,"heravi");
        people [1] = new Person("soheyl",26,"satarkhan");
        people [2] = new Person("ali",30,"afsarieh");
        people [3] = new Person("mohammad",20,"shakrak");
        people [4] = new Person("saji",20,"dadman");
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
            System.out.println(people[i].getAge());
        }
    }
}
