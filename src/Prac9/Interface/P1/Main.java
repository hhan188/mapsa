package Prac9.Interface.P1;

import java.util.Arrays;

public class Main {
    public static <T extends Sortable> T[] sort(T[] objects) {
        T temp = null;
        for (int i = 0; i < objects.length; i++) {
            for (int j = 1; j < objects.length - i; j++) {
                if (objects[j-1].compare(objects[j]) > 0) {
                    temp = objects[j-1];
                    objects[j-1] = objects[j];
                    objects[j] = temp;
                }
            }
        }
        return objects;
    }
    public static void main(String[] args) {
        Person p1 = new Person(2, "sajjad");
        Person p2 = new Person(12, "mohammad");
        Person p3 = new Person(123, "majid");
        Person p4 = new Person(96, "amir");
        Person p5 = new Person(534, "abbas");
        Person[] people = {p1, p2, p3, p4, p5};
        System.out.println(Arrays.toString(sort(people)));

        House h1 = new House(25, "sajjad");
        House h2 = new House(10, "mmd");
        House h3 = new House(25, "asghar");
        House h4 = new House(500, "sughra");
        House h5 = new House(80, "kobra");
        House[] houses = {h1, h2, h3, h4, h5};
        System.out.println(Arrays.toString(sort(houses)));


    }
}
