package Prac10.P47;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name, weapon;
    private int hitPoints, strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public <T extends List<String>> T write() {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(String.valueOf(hitPoints));
        list.add(String.valueOf(strength));
        list.add(weapon);
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
        return "name='" + name + "', hitpoint=" + hitPoints + ", strength=" + strength + ", weapon='" + weapon + "'";
    }
}
