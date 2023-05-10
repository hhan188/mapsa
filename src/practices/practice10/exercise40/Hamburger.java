package practices.practice10.exercise40;

import com.google.gson.Gson;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger() {
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public Hamburger setName(String name) {
        this.name = name;
        return this;
    }

    public String getMeat() {
        return meat;
    }

    public Hamburger setMeat(String meat) {
        this.meat = meat;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Hamburger setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public Hamburger setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
        return this;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
