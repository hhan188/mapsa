package Practice8_3.Final;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        int area=width*height;
    }

    public Rectangle(int length ) {
        this.height = 20;
        this.width=8;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
