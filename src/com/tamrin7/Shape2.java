package com.tamrin7;

public class Shape2
{
    private String color;
    private boolean filled;
    private double area;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape2(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public double getArea ()
    {
        return area;
    }

}
