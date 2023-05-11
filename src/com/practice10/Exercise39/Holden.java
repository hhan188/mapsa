package com.practice10.Exercise39;

public class Holden extends Car
{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    public void startEngine ()
    {
        System.out.println("Holden Started");
    }

    public void accelerate ()
    {
        System.out.println("Holden Accelerating");
    }

    public void brake()
    {
        System.out.println("Holden Braked");
    }
}
