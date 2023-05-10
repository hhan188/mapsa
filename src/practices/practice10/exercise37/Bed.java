package practices.practice10.exercise37;

import com.google.gson.Gson;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed() {
    }

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public String getStyle() {
        return style;
    }

    public Bed setStyle(String style) {
        this.style = style;
        return this;
    }

    public int getPillows() {
        return pillows;
    }

    public Bed setPillows(int pillows) {
        this.pillows = pillows;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Bed setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getSheets() {
        return sheets;
    }

    public Bed setSheets(int sheets) {
        this.sheets = sheets;
        return this;
    }

    public int getQuilt() {
        return quilt;
    }

    public Bed setQuilt(int quilt) {
        this.quilt = quilt;
        return this;
    }

    public void make(){
        System.out.println("Bed -> Making | "+this);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
