package Tamrin10.ex47;

import java.util.Arrays;
import java.util.List;

public class Player implements ISaveable {
    private String called;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String called, int hitPoints, int strength) {
        this.called = called;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public Player() {

    }

    @Override
    public void read(List<String> t) {
       Player palyer = new Player(t.get(0),
                Integer.valueOf(t.get(1)),
                Integer.valueOf(t.get(2))
        );
        setCalled(palyer.getCalled());
        setHitPoints(palyer.getHitPoints());
        setStrength(palyer.getStrength());
        setWeapon(palyer.getWeapon());

    }


    @Override
    public List<String> write() {
        List<String> list = Arrays.asList(
                this.called,
                this.weapon,
                String.valueOf(this.hitPoints),
                String.valueOf(this.strength)
        );
        return list;
    }

    //Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}
    @Override
    public String toString() {
        return "Player { name =" + this.getCalled() + ", hitpoints =" +
                this.getHitPoints() + ", strength =" + this.getStrength() + ", weapon =" + this.getWeapon() + "}";
    }


    public String getCalled() {
        return called;
    }

    public void setCalled(String called) {
        this.called = called;
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
}
