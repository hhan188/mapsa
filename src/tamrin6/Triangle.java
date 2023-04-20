package tamrin6;
//Problem 1 solution
public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        setBase(base);
        setHeight(height);
    }

    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("Base cannot be zero or negative");
        this.base = base;
    }

    public void setHeight(double height) {
        if (height <= 0)
            throw new IllegalArgumentException("Height cannot be zero or negative");
        this.height = height;
    }
}
