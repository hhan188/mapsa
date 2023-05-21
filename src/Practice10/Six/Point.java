package Practice10.Six;

public class Point {
    private int x ;
    private int y ;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
    }

    public int getX() {
        return x;
    }
    public double distance(){
        return Math.sqrt((x*x)+(y*y));
    }
    public int distance(int z , int b){
        return (int)Math.sqrt ((x-z)*(x-z)+(y-b)*(y-b));
    }
    public double distance(double z , double b){
        return Math.sqrt ((x-z)*(x-z)+(y-b)*(y-b));

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
}
