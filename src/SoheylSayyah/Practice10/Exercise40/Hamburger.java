package SoheylSayyah.Practice10.Exercise40;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String name;
    private int price;
    private String meat;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger() {
    }

    public Hamburger(String name, int price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String meat, double price) {

    }

    public void addHamburgerAddition1(String name,double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name,double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name,double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name,double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }
    public double itemizeHamburger(){
        List<Double> list = new ArrayList<>();
        double temp = 0;
        if (addition1Name != null){
            list.add(addition1Price);
            temp += addition1Price;
        }
        if (addition2Name != null){
            list.add(addition2Price);
            temp += addition2Price;
        }
        if (addition3Name != null){
            list.add(addition3Price);
            temp += addition3Price;
        }
        if (addition4Name != null){
            list.add(addition4Price);
            temp += addition4Price;
        }
        return temp;
    }
}
