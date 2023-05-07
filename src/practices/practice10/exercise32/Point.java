package practices.practice10.exercise32;

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

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    protected double distance() {
        double pow = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(pow);
    }

    protected double distance(int x, int y) {
        double pow = Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2);
        return Math.sqrt(pow);

    }

    protected double distance(Point point) {
        return Math.sqrt(distance(point.getX(), point.getY()));

    }


}
