package tamrin9.interfaces.p1;

import static tamrin9.interfaces.p1.Utils.*;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[]{
                new Person("Ali",12),
                new Person("Behrad",6),
                new Person("Mina",18),
                new Person("Sara",31),
                new Person("Hani",25)
        };

        printArray(people);
        sort(people);
        printArray(people);
        System.out.println();

        Car[] cars = new Car[]{
                new Car("BMW M5", 2006),
                new Car("BMW X3", 2010),
                new Car("Pride", 1999),
                new Car("Peykan", 1980),
        };

        printArray(cars);
        sort(cars);
        printArray(cars);
        System.out.println();

        House[] houses = new House[]{
                new House("001", 115.3F),
                new House("002", 105.1F),
                new House("003", 75.6F),
                new House("004", 220),
                new House("005", 63.5F),
        };

        printArray(houses);
        sort(houses);
        printArray(houses);

    }

}
