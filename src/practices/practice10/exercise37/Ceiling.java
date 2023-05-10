package practices.practice10.exercise37;

public class Ceiling {
private int height;
private int paintedColor;

    public Ceiling() {
    }

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public Ceiling setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public Ceiling setPaintedColor(int paintedColor) {
        this.paintedColor = paintedColor;
        return this;
    }
}
