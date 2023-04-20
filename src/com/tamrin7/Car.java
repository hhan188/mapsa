package com.tamrin7;

public class Car extends Vehicle
{
    private int numberOfDoors;

    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine()
    {
        System.out.println("Car Engine Started");
    }
}
