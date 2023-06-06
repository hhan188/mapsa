package practice9.interface6;

public class Rectangle5 implements Resizable {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle5(int width, int height) {
        this.width = width;
        this.height=height;
    }

    @Override
    public void resize(int percentage){
        System.out.println("new width is : "+width*percentage/100);
        System.out.println("new height is : "+height*percentage/100);



    }

    public static class UsingRectangle5 {
        public static void main(String[] args) {
            Rectangle5 rectangle=new Rectangle5(57,43);
            rectangle.resize(4);
        }
    }
}
