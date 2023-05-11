package com.practice9.finalPractice;

public class Rectangle
{
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle (int length)
    {
        this(length,length);
    }

    public void calcArea ()
    {
        System.out.println(this.width * this.height);
    }
}
