package Prac6;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public boolean isSameCar(Car anotherCar2) {
        return make.equals(anotherCar2.make) &&
                model.equals(anotherCar2.model) &&
                year == anotherCar2.year;
    }
}
