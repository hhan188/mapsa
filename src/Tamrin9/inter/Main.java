package Tamrin9.inter;

import java.util.Arrays;
import java.util.List;

public class Main {
//Create an interface called Sortable with a method compare().
// Create classes Person, Car, and House that implement the Sortable interface.
// Write a program that creates an array of Sortable objects and sorts them using the compare() method.

    public static void main(String[] args) {
        Person hanieh = new Person(40, "hanieh");
        Person hedieh = new Person(23, "hedieh");
        Person ali = new Person(13, "Ali");
        List<Person> list = Arrays.asList(hanieh, hedieh, ali);
        Person temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compare(list.get(j)) == 1) {
                    temp = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i,temp);
                }
            }
        }
        for (Person s :
                list) {
            System.out.println(s);
        }


    }
}

