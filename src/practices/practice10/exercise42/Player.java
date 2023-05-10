package practices.practice10.exercise42;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveAble<String> {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public String getWeapon() {
        return weapon;
    }

    public Player setWeapon(String weapon) {
        this.weapon = weapon;
        return this;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public Player setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
        return this;
    }

    public int getStrength() {
        return strength;
    }

    public Player setStrength(int strength) {
        this.strength = strength;
        return this;
    }


    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
            list.add(getName());
            list.add(getWeapon());
            list.add(String.valueOf(getStrength()));
            list.add(String.valueOf(getHitPoints()));
        return list;
    }

    @Override
    public List<String> read() {
        if (write().size() != 0) {
            return write();
        }
        return null;
    }
}
