package SoheylSayyah.Practice7.Exercise2;

public class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void getColorMethod(){
        System.out.println(this.color);
    }
}
