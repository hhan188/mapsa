package com.practice10.Exercise31;

public class Wall2
{
    private double width;
    private double height;

    public Wall2()
    {

    }

    public Wall2(double width, double height) {
        if (width < 0)
        {
            this.width = 0;
        }
        else if (height < 0)
        {
            this.height = 0;
        }
        else
        {
            this.width = width;
            this.height = height;
        }

    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0)
        {
            this.width = 0;
        }
        else
        {
            this.width = width;
        }


    }

    public void setHeight(double height) {
        if (height < 0)
        {
            this.height = 0;
        }
        else
        {
            this.height = height;
        }

    }

    public double getArea ()
    {
        return this.width * this.height;
    }
}
