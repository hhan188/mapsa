package com.tamrin7;

public class Circle3 extends Shape2
{

    private double radius;
    public Circle3(String color, boolean filled, double radius)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea ()
    {
        return (radius*radius)*Math.PI;
    }
}
