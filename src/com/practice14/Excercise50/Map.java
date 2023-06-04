package com.practice14.Excercise50;

import java.util.HashMap;

public class Map<W, O> {
    private HashMap<Integer, String> myMap;
    private HashMap <String, String> vocabulary;
    public Map()
    {
        vocabulary = new HashMap<>();
        this.vocabulary.put("N", "NORTH");
        this.vocabulary.put("S", "SOUTH");
        this.vocabulary.put("E", "EAST");
        this.vocabulary.put("W", "WEST");

        myMap = new HashMap<>();
        myMap.put(1, "Forest");
        myMap.put(2, "Park");
        myMap.put(3, "Library");
        myMap.put(4, "House");
        myMap.put(5, "Stadium");
        myMap.put(6, "Cinema");
        myMap.put(7, "Sea");
        myMap.put(8, "Beach");
        myMap.put(9, "Market");

    }

    public HashMap<String, String> getVocabulary()
    {
        return vocabulary;
    }

    public HashMap<Integer, String> getMyMap()
    {
        return myMap;
    }

    public boolean northChecker (int loc)
    {
        return loc == 1 || loc == 2 || loc == 3 || loc == 6 || loc == 5 || loc == 4;
    }

    public boolean southChecker (int loc)
    {
        return loc == 7 || loc == 8 || loc == 9 || loc == 6 || loc == 5 || loc == 4;
    }

    public boolean eastChecker (int loc)
    {
        return loc == 3 || loc == 6 || loc == 9 || loc == 2 || loc == 5 || loc == 8;
    }

    public boolean westChecker (int loc)
    {
        return loc == 1 || loc == 4 || loc == 7 || loc == 2 || loc == 5 || loc == 8;
    }
}
