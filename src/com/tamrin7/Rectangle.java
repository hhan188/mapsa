package com.tamrin7;

public class Rectangle extends Shape2
{
    private int width;
    private int height;

    public Rectangle(String color, boolean filled, int width, int height)
    {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getArea ()
    {
        return width*height;
    }
}
