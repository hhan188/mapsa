package practices.practice14.exercise18;

import com.google.gson.Gson;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    public Hamburger() {
    }

    public Hamburger(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Hamburger(String name, String meat, double price, String breadRollType) {

        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name+" hamburger on a "+breadRollType+" roll with "+meat+" price is $"+price);
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
 public   void addHamburgerAddition1(String meal,double addPrise){
        double price=getPrice()+addPrise;
        setPrice(price);
     System.out.println("Added "+meal+" for an extra "+addPrise);
 }
    public   void addHamburgerAddition2(String meal,double addPrise){
        double price=getPrice()+addPrise;
        setPrice(price);
        System.out.println("Added "+meal+" for an extra "+addPrise);
    }
    public   void addHamburgerAddition3(String meal,double addPrise){
        double price=getPrice()+addPrise;
        setPrice(price);
        System.out.println("Added "+meal+" for an extra "+addPrise);
    }
    public   void addHamburgerAddition4(String meal,double addPrise){
        double price=getPrice()+addPrise;
        setPrice(price);
        System.out.println("Added "+meal+" for an extra "+addPrise);
    }

    public double itemizeHamburger(){
        return getPrice();
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
