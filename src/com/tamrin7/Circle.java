package com.tamrin7;

public class Circle extends Shape
{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor()
    {
        return "Circle Color is: " + super.getColor();
    }
}
