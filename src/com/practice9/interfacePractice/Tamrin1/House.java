package com.practice9.interfacePractice.Tamrin1;

import java.util.List;

public class House implements Sortable
{
    private String name;
    private int area;

    private List<House> houses;

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public House(String name, int area) {
        this.name = name;
        this.area = area;
    }

    public House() {

    }

    @Override
    public void compare()
    {
        House house;
        for (int i = 0; i < houses.size(); i++)
        {
            for (int j = i+1; j < houses.size(); j++)
            {
                if (houses.get(i).area < houses.get(j).area)
                {
                    house = houses.get(i);
                    houses.set(i, houses.get(j));
                    houses.set(j, house);
                }
            }
        }
    }

    @Override
    public String toString() {
        String print = "";
        for (House house : getHouses())
        {
            print += "House {" + "name = " + house.name + ", price = " + house.area + '}' + "\n";
        }
        return print;
    }
}
