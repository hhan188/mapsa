package com.tamrin7;

public class Square extends Rectangle
{
    private int sideLength;

    public Square(String color, boolean filled, int width, int height, int sideLength)
    {
        super(color, filled, width, height);
        this.sideLength = sideLength;
    }

    @Override
    public double getArea ()
    {
        return sideLength*sideLength;
    }
}
