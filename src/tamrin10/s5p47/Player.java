package tamrin10.s5p47;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player() {
    }

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
    public List<String> write() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add(this.getName());
        stringArrayList.add(String.valueOf(this.getHitPoints()));
        stringArrayList.add(String.valueOf(this.getStrength()));
        stringArrayList.add(this.getWeapon());
        return stringArrayList;
    }

    @Override
    public void read(List<String> list) {
        if (list == null || list.size() == 0)
            return;

        this.setName(list.get(0));
        this.setHitPoints(Integer.parseInt(list.get(1)));
        this.setStrength(Integer.parseInt(list.get(2)));
        this.setWeapon(list.get(3));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
