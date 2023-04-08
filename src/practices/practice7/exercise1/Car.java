package practices.practice7.exercise1;

import practices.practice7.exercise22.CarBrands;

public class Car extends Vehicle {

    private int numberOfDoors;

    private CarBrands brands;

    public Car() {
    }


    public Car(double maxSpeed, int numberOfDoors, CarBrands brands) {
        super(maxSpeed);
        this.numberOfDoors = numberOfDoors;
        this.brands = brands;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public CarBrands getBrands() {
        return brands;
    }

    public void setBrands(CarBrands brands) {
        this.brands = brands;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public String toString() {
        return "{" +
                "numberOfDoors=" + numberOfDoors +
                " max speed=" + getMaxSpeed() +
                ", brands=" + brands +
                '}';
    }
}
