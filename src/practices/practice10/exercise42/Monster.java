package practices.practice10.exercise42;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveAble<String> {
    private String name;
    private int hitPoints;
    private int strength;

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
    public List<String> write() {
        List<String> list = new ArrayList<>();
            list.add(getName());
            list.add(String.valueOf(getStrength()));
            list.add(String.valueOf(getHitPoints()));
        return list;
    }

    @Override
    public List<String> read() {
        if (write().size()!=0){
            return write();
        }
        return null;
    }
}
