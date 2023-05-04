package Practice8_3.P6;

public class Rectangle implements Resizable{
    private int width; //عرض
    private int height;//// ارتفاع

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(int percentage) {
        int newWidth=width*percentage/100;
        int newHeight=height*percentage/100;
        System.out.println("newHeight is: "+newHeight+"  newWidth is: "+newWidth);

    }

}
