package practices.practice14.exercise7;

import com.google.gson.Gson;

public class Wall {
    private double width, height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public Wall setWidth(double width) {
        if (width < 0) {
            width = 0;
        }
        this.width = width;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public Wall setHeight(double height) {
        if (height<0){
            height=0;
        }
        this.height = height;
        return this;
    }


    public double getArea(){
        return getHeight()*getWidth();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
