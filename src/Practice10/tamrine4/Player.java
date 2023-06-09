package Practice10.tamrine4;

import java.util.ArrayList;
import java.util.List;

public class Player implements IsSavable{
    private String name;
    private int hitpoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon="sword";//**
    }

    public Player() {
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

    public int getHitpoints() {
        return hitpoints;
    }

private void setHitPoints(int parseInt) {
}

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        ArrayList<String> lst=new ArrayList<>();
        lst.add(this.getName());
        lst.add(String.valueOf(this.getHitpoints()));
        lst.add(String.valueOf(getStrength()));
        lst.add(this.getWeapon());
        return lst;
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
                ", weapon='" + weapon + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                '}';
    }



}
