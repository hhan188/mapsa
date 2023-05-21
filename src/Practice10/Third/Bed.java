package Practice10.Third;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilts) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }
    public void make(){
        System.out.println("the bed is make");
    }
    public String getStyle(){
        return style;
    }
    public int getPillows(){
        return pillows;
    }
    public int getHeight(){
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}
