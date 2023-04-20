package SoheylSayyah.Practice7.Exercise26;

public class Square extends Rectangle{
    private int sideLength;

    public Square(String color, String filled, int sideLength) {
        super(color, filled,0,0);
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
    public void getArea(){
        System.out.println(sideLength * sideLength);
    }
}
