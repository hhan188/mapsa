package com.practice14.Excercise51;

public final class Location
{
    private final double x;
    private final double y;
    private final double currentLocation;

    public Location(double x, double y)
    {
        this.x = x;
        this.y = y;
        this.currentLocation = x + y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getCurrentLocation()
    {
        return currentLocation;
    }
}
