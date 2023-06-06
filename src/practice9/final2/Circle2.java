package practice9.final2;

public class Circle2 {
    private final double PI=3.14;
    private int radius;

    public Circle2(int radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return PI*(radius*radius);
    }
}
