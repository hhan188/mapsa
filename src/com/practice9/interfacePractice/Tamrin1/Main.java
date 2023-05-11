package com.practice9.interfacePractice.Tamrin1;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Car totalCars = new Car();
        Car car1 = new Car("Dena", 500_000_000);
        Car car2 = new Car("Pride", 200_000_000);
        Car car3 = new Car("Pride 111", 180_000_000);
        Car car4 = new Car("Quick", 350_000_000);
        List <Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        totalCars.setCars(cars);
        totalCars.compare();
        System.out.println(totalCars);


        House totalHouses = new House();
        House house1 = new House("House 1", 150);
        House house2 = new House("House 2", 80);
        House house3 = new House("House 3", 250);
        House house4 = new House("House 4", 120);
        List <House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        totalHouses.setHouses(houses);
        totalHouses.compare();
        System.out.println(totalHouses);


        Person totalPersons = new Person();
        Person person1 = new Person("Ramin", 28);
        Person person2 = new Person("Reza", 30);
        Person person3 = new Person("Hasan", 29);
        Person person4 = new Person("Milad", 27);
        List <Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        totalPersons.setPeople(people);
        totalPersons.compare();
        System.out.println(totalPersons);
    }
}
