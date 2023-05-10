package practices.practice10.exercise37;

import com.google.gson.Gson;

public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp() {
    }

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public String getStyle() {
        return style;
    }

    public Lamp setStyle(String style) {
        this.style = style;
        return this;
    }

    public boolean isBattery() {
        return battery;
    }

    public Lamp setBattery(boolean battery) {
        this.battery = battery;
        return this;
    }

    public int getGlobRating() {
        return globRating;
    }

    public Lamp setGlobRating(int globRating) {
        this.globRating = globRating;
        return this;
    }
    public void turnOn(){
        System.out.println("Lamp->Turning On | "+this);
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
