package SoheylSayyah.Practice9.Interface.Exercise6;

public class Rectangle implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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

    @Override
    public void resize(int percentage) {
        if (percentage < 0) {
            width = this.width - (this.width * percentage / 100);
            height = this.height - (this.height * percentage / 100);
        } else {
            width = this.width + (this.width * percentage / 100);
            height = this.height + (this.height * percentage / 100);
        }
    }
}