package practice9.final3;

public class RectangleFinal {
    private final int width;
    private final int height;
    public RectangleFinal(int width,int height){
        this.width=width;
        this.height=height;
    }
    public int calculateArea(){
        return width*height/2;
    }


}
