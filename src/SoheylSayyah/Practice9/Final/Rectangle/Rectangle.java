package SoheylSayyah.Practice9.Final.Rectangle;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int areaCalculator(){
        return width * height;
    }
    public Rectangle(int length){
        this(length,length);
    }
}
