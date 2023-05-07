package Prac10.P40;

public class Hamburger {
    private String name, meat, breadRollType;
    private double price;
    private String addition1Name = "", addition2Name = "", addition3Name = "", addition4Name = "";
    private double addition1Price, addition2Price, addition3Price, addition4Price;
    public Hamburger(String name, String meat, String breadRollType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }

    public void addHamburgerAddition1(String name, double price) {
        addition1Name = name;
        addition1Price = price;
        this.price += price;
    }
    public void addHamburgerAddition2(String name, double price) {
        addition2Name = name;
        addition2Price = price;
        this.price += price;
    }
    public void addHamburgerAddition3(String name, double price) {
        addition3Name = name;
        addition3Price = price;
        this.price += price;
    }
    public void addHamburgerAddition4(String name, double price) {
        addition4Name = name;
        addition4Price = price;
        this.price += price;
    }

    public double itemizeHamburger() {
        String itemizedBurger = "hamburger : \n" +
                "  name          => " + name + "\n" +
                "  price         => " + price + "\n" +
                "  meat          => " + meat + "\n" +
                "  breadRollType => " + breadRollType + "\n";

        if (!addition1Name.equals(""))
            itemizedBurger += "additions : \n" +
                    "  addition one : \n" +
                    "    name  => " + addition1Name + "\n" +
                    "    price => " + addition1Price + "\n";

        if (!addition2Name.equals(""))
            itemizedBurger += "  addition two : \n" +
                    "    name  => " + addition2Name + "\n" +
                    "    price => " + addition2Price + "\n";

        if (!addition3Name.equals(""))
            itemizedBurger += "  addition three : \n" +
                    "    name  => " + addition3Name + "\n" +
                    "    price => " + addition3Price + "\n";

        if (!addition4Name.equals(""))
            itemizedBurger += "  addition four : \n" +
                    "    name  => " + addition4Name + "\n" +
                    "    price => " + addition4Price + "\n";

        System.out.println(itemizedBurger);
        return price;
    }

}
