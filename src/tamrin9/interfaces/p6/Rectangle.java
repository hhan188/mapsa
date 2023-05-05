package tamrin9.interfaces.p6;

public class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(int percentage){
        width  = width * percentage / 100;
        height = height * percentage / 100;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                "}";
    }
}
