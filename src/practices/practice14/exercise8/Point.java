package practices.practice14.exercise8;

import com.google.gson.Gson;

public class Point {
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

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }

    public double distance() {
        return distance(this.x, this.y);
    }

    public double distance(int x, int y) {
        if (x == this.x && y == this.y) {
            x = 0;
            y = 0;
        }

        double dis = Math.pow((this.x - x), 2) + Math.pow(this.y - y, 2);
        return Math.sqrt(dis);
    }

    public double distance(Point point) {

        return distance(point.x, point.y);
    }


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
