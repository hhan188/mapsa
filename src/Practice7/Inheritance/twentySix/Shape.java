package Practice7.Inheritance.twentySix;

public class Shape {
    String color;
    boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public void getArea(){
        System.out.println("Shape doesn't recognize");
    }
}
