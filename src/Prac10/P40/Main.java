package Prac10.P40;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("crabby", "cow", "dayere", 10);
        hamburger.addHamburgerAddition1("panir", 3);
        hamburger.addHamburgerAddition2("piaz", 1);
        hamburger.itemizeHamburger();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.itemizeHamburger();

    }
}
