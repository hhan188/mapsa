package Practice10.Interface;

public class Player implements Saveable{
    private String name;
    private String weapon;
    private int hitPoints;
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
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

}
