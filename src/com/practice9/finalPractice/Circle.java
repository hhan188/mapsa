package com.practice9.finalPractice;

public class Circle
{
    private double area;
    private final double PI = 3.14;

    public Circle(double radius)
    {
        area = (radius * radius) * PI;
    }

    @Override
    public String toString() {
        return area + "";
    }
}
