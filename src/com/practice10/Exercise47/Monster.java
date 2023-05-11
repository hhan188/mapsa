package com.practice10.Exercise47;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable
{
    private String name;
    private String hitPoints;
    private String strength;

    List <String> l = new ArrayList<>();


    public Monster(String name, String hitPoints, String strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public Monster() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(String hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        return l;
    }

    @Override
    public void read(List<String> list)
    {
        if (list != null)
        {

            l.add(list.get(0));
            l.add(list.get(1));
            l.add(list.get(2));
        }
    }

    @Override
    public String toString() {
        List <String> myList = write();
        setName(myList.get(0));
        setHitPoints(myList.get(1));
        setStrength(myList.get(2));

        return "Monster {" + "name = " + getName() + ", hitPoints = " + getHitPoints() + ", strength = " + getStrength() + '}';
    }
}
