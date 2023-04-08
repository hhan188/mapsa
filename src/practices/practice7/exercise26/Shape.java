package practices.practice7.exercise26;

public class Shape {
    private Colors color;
    private boolean filled;

    public Shape() {
    }

    public Shape(Colors color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "color=" + color +
                ", filled=" + filled +
                '}';
    }
}
