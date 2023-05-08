package Practice10.Point;

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

    public double distance(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
    public double distance(double a,double b){
       return Math.sqrt(a-x)+(a-x)*(b-y)+(b-y);
    }
    public int distance(int a,int b){
        return (int) Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
    }



}
