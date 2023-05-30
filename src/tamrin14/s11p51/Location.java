package tamrin14.s11p51;

import java.util.HashMap;
import java.util.Map;

// Don't allow the class to be subclassed
public final class Location {

    //Make all fields final and private
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;


    //As an added Task, handle the case where "exits" is null when passed to the constructor
    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;

        if (exits == null)
            this.exits = new HashMap<String, Integer>();
        else
            this.exits = new HashMap<String, Integer>(exits);

        this.exits.put("Q", 0);
    }

    public void addExit(String direction, int location) {
        exits.put(direction, location);
    }

    //Don't provide setters.
//    public void setLocationID(int locationID) {
//        this.locationID = locationID;
//    }

    public int getLocationID() {
        return locationID;
    }

    //Don't provide setters.
//    public void setDescription(String description) {
//        this.description = description;
//    }

    public String getDescription() {
        return description;
    }

    //Don't provide setters.
//    public void setExits(Map<String, Integer> exits) {
//        this.exits = exits;
//    }

    public Map<String, Integer> getExits() {
        return exits;
    }

}
