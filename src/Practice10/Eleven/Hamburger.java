package Practice10.Eleven;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public Hamburger(String meat, double price) {
        this.meat = meat;
        this.price = price;
    }

    public Hamburger() {
    }


    public void addHamburgerAddition1(String name,double price){
       addition1Name=name;
       addition1Price=price;
    }
    public void addHamburgerAddition2(String name,double price){
        addition2Name=name;
        addition2Price=price;
    }
    public void addHamburgerAddition3(String name,double price){
        addition3Name=name;
        addition3Price=price;
    }
    public void addHamburgerAddition4(String name , double price){
        addition4Name= name;
        addition4Price=price;
    }
    public double itemizehamburger(){
        List<Double> list = new ArrayList<>();
        double temp = 0;
        if (addition1Name!=null){
            list.add(addition1Price);
            temp+=addition1Price;
        }
        if (addition2Name!=null){
            list.add(addition2Price);
            temp+=addition2Price;
        }
        if (addition3Name!=null){
            list.add(addition3Price);
            temp+=addition3Price;
        }
        if (addition4Name!=null){
            list.add(addition4Price);
            temp+=addition4Price;
        }
        return temp;
    }

}
