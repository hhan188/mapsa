package Prac10.P47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints, strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public <T extends List<String>> T write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));
        return (T) list;
    }

    @Override
    public <T extends List<String>> void read(T strings) {
        if (strings.isEmpty()) {
            return;
        }

        List<String> list = new ArrayList<>(strings);
    }

    @Override
    public String toString() {
        return "name='" + name + "', hitpoint=" + hitPoints + ", strength=" + strength;
    }
}
