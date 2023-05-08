package SoheylSayyah.Practice10.Exercise40;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, int price, String meat, String breadRollType) {
        super(name, price, meat, breadRollType);
        addHamburgerAddition1("Fixing", 19.10);
        addHamburgerAddition2("Drink",19.10);
        addHamburgerAddition3("Chips",19.10);
    }
}
