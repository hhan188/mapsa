package com.practice10.Exercise39;

public class Ford extends Car
{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine ()
    {
        System.out.println("Ford Started");
    }

    public void accelerate ()
    {
        System.out.println("Ford Accelerating");
    }

    public void brake()
    {
        System.out.println("Ford Braked");
    }
}
