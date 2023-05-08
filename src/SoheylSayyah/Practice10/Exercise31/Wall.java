package SoheylSayyah.Practice10.Exercise31;

public class Wall {
    private double height;
    private double width;

    public Wall() {
    }

    public Wall(double height, double width) {
        if (height < 0){
            this.height = 0;
        } else if (width < 0) {
            this.width = 0;
        }
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        if (height < 0){
            return 0;
        }
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        if (width < 0){
            return 0;
        }
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        if (height < 0 || width < 0){
            return 0;
        }
        return height * width;
    }
}
