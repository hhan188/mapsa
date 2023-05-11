package com.practice10.Exercise32;

public class Point
{
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance ()
    {
        int x = 0;
        int y = 0;

//        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
        return distance(x, y);
    }

    public double distance (int x, int y)
    {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }

    public double distance (Point a)
    {
//        return Math.sqrt(((a.x - this.x) * (a.x - this.x)) + ((a.y - this.y) * (a.y - this.y)));
        return distance(a.x, a.y);
    }
}
