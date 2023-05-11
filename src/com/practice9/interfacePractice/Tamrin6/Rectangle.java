package com.practice9.interfacePractice.Tamrin6;

public class Rectangle implements Resizable
{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
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
    public void resize(int percentage) {
        if (percentage < 0)
        {
            this.width = this.width - (this.width * percentage / 100);
            this.height = this.height - (this.height * percentage / 100);
        }
        else
        {
            this.width = this.width + (this.width * percentage / 100);
            this.height = this.height + (this.height * percentage / 100);
        }
    }


}
