package com.practice10.Exercise39;

public class Car
{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheel;


    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheel = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine ()
    {
        System.out.println("Car Started");
    }

    public void accelerate ()
    {
        System.out.println("Car Accelerating");
    }

    public void brake()
    {
        System.out.println("Car Braked");
    }
}
