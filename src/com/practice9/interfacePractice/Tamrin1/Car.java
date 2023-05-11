package com.practice9.interfacePractice.Tamrin1;

import java.util.List;

public class Car implements Sortable
{
    private String name;
    private double price;

    private List <Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Car() {

    }

    @Override
    public void compare()
    {
        Car car;
        for (int i = 0; i < cars.size(); i++)
        {
            for (int j = i+1; j < cars.size(); j++)
            {
                if (cars.get(i).price < cars.get(j).price)
                {
                    car = cars.get(i);
                    cars.set(i, cars.get(j));
                    cars.set(j, car);
                }
            }
        }
    }

    @Override
    public String toString() {
        String print = "";
        for (Car car : getCars())
        {
            print += "Car {" + "name = " + car.name + ", price = " + car.price + '}' + "\n";
        }
        return print;
    }
}
