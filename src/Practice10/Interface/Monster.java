package Practice10.Interface;

public class Monster implements Saveable{
    private String name;
    private  int hitPoints;
    private int strength;

    @Override
    public String write() {
        return null;
    }

    @Override
    public void read(String st) {

    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }
}
