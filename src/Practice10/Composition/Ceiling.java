package Practice10.Composition;

public class Ceiling {
    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public void setPaintedColor(int paintedColor) {
        this.paintedColor = paintedColor;
    }
}
