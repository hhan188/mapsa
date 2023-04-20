package com.tamrin7;

public class Circle2
{
    private float radius;


    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float calcCircumference ()
    {
        return (float) (2*Math.PI*radius);
    }
}
