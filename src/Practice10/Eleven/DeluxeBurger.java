package Practice10.Eleven;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
        addHamburgerAddition1("Fixings",19.10);
        addHamburgerAddition2("drink",19.10);
        addHamburgerAddition3("chips",19.10);
    }
}
