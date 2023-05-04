package Practice8_3.Final;

public class Circle {
    private final double PI=3.14;
    private double r;
    public Circle(double PI,double r){
        double area =r*r*PI;


    }
    public double CalculatesArea(double PI,double r){
        double area =r*r*PI;
        return area;
    }

    public double getPI() {
        return PI;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
