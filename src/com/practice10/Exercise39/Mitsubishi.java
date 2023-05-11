package com.practice10.Exercise39;

public class Mitsubishi extends Car
{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine ()
    {
        System.out.println("Mitsubishi Started");
    }

    public void accelerate ()
    {
        System.out.println("Mitsubishi Accelerating");
    }

    public void brake()
    {
        System.out.println("Mitsubishi Braked");
    }
}
