package practices.practice9.interface1.exercise6;

public class Rectangle implements Resizable {

    private double width;
    private double height;


    @Override
    public void resize(int percentage) {
        double percent = (double) percentage / 100;
        setHeight(getHeight() - percent * getHeight());
        setHeight(getWidth() - percent * getWidth());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
