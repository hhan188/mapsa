package SoheylSayyah.Practice10.Exercise47;

import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = Arrays.asList(
                this.name,
                this.weapon,
                String.valueOf(this.hitPoints),
                String.valueOf(this.toString())
        );
        return list;
    }


    @Override
    public void read(List<String> t) {
        Player player = new Player(t.get(0),
                Integer.valueOf(t.get(1)),
                Integer.valueOf(t.get(2))
        );
        System.out.println(player.toString());
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

    public Player() {
    }
}
