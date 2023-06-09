package Practice10.tamrine3;

public class Bedroom {
    private String wall1;
    private String wall2;
    private String wall3;
    private String wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String wall1, String wall2, String wall3, String wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getlamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom-> making bed");
        bed.make();

    }
}
