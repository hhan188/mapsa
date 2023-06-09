package Practice10.tamrine3;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style=style;
        this.battery = battery;
        this.globRating=globRating;

    }
    public void turnOn(){
        System.out.println("the lamp is on.");
    }

    public String getStyle() {
        return style;
    }
    public boolean IsBattery(){
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
