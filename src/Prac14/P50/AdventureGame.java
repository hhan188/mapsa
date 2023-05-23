package Prac14.P50;

import java.util.HashMap;

public class AdventureGame {
    public HashMap<String, String> vocabulary;
    private Places currentPlace;

    public AdventureGame() {
        vocabulary = new HashMap<>();
        fillVocabulary();
        currentPlace = Places.SAFEZONE;
    }

    public void setCurrentPlace(Places currentPlace) {
        this.currentPlace = currentPlace;
    }

    public void PrintAvailablePlaces() {
        StringBuilder builder = new StringBuilder();
        builder.append("you are currently at location " + getCurrentPlace() + " where do you wanna go?\n");
        builder.append("avaiable places is : \n");
        getAvailablePlaces().forEach(
                (direction, place) -> {
                    if (place != null)
                        builder.append(direction + " (" + direction.substring(0, 1).toUpperCase() + ") " + " -> " + place + "\n");
                }
        );
        System.out.print(builder.toString());
    }

    public HashMap<String, Places> getAvailablePlaces() {
        HashMap<String, Places> avPlaces = new HashMap<>();
        switch (currentPlace) {
            case CITY -> {
                avPlaces.put("north", null);
                avPlaces.put("east", null);
                avPlaces.put("south", Places.SAFEZONE);
                avPlaces.put("west", null);
            }
            case SAFEZONE -> {
                avPlaces.put("north", Places.CITY);
                avPlaces.put("east", Places.MOUNTAIN);
                avPlaces.put("south", Places.HOME);
                avPlaces.put("west", Places.FOREST);
            }
            case FOREST -> {
                avPlaces.put("north", null);
                avPlaces.put("east", Places.SAFEZONE);
                avPlaces.put("south", null);
                avPlaces.put("west", Places.DUNGEON);
            }
            case MOUNTAIN -> {
                avPlaces.put("north", null);
                avPlaces.put("east", null);
                avPlaces.put("south", null);
                avPlaces.put("west", Places.SAFEZONE);
            }
            case HOME -> {
                avPlaces.put("north", Places.SAFEZONE);
                avPlaces.put("east", null);
                avPlaces.put("south", null);
                avPlaces.put("west", null);
            }
            case DUNGEON -> {
                avPlaces.put("north", null);
                avPlaces.put("east", Places.FOREST);
                avPlaces.put("south", null);
                avPlaces.put("west", null);
            }
        }
        return avPlaces;
    }

    private void fillVocabulary() {
        vocabulary.put("N", "north");
        vocabulary.put("E", "east");
        vocabulary.put("S", "south");
        vocabulary.put("W", "west");
    }

    public HashMap<String, String> getVocabulary() {
        return vocabulary;
    }

    public Places getCurrentPlace() {
        return currentPlace;
    }
}
