package Practice9.Inface.Six;

public class Rectangle implements Resizable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void resize(int percentage) {
        width = width + width * percentage / 100;
        height = height + height * percentage / 100;
    }

}
