package Practice10.tamrine4;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;

public class Monster implements IsSavable {
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(name);
        arr.add(Integer.toString(hitPoints));
        arr.add(Integer.toString(hitPoints));
        return arr;
    }


    @Override
    public void read(List<String> list) {
        if (list == null || list.size() == 0)
            return;
        this.name=list.get(0);
        this.hitPoints=Integer.parseInt(list.get(1));
        this.strength=Integer.parseInt(list.get(2));



    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
