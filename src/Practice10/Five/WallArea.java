package Practice10.Five;

public class WallArea {
    private double height;
    private double width;

    public WallArea(double height, double width) {
        this.height = height;
        this.width = width;
        if (width<0){
            this.height=0;
        }
        if (height<0){
            this.height=0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
        if (height<0){
            this.height=0;
        }
    }

    public void setWidth(double width) {
        this.width = width;
        if (width<0){
            this.width=0;
        }
    }
    public double getArea(){
        return width*height;
    }

    public WallArea() {
    }

}
